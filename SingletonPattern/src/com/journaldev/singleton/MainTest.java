package com.journaldev.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MainTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Lấy instance của Singleton
		EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();

		// In ra thông báo để kiểm tra
		System.out.println("EagerInitializedSingleton instance created!");

		// Lấy instance của Singleton
		StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();

		// In ra thông báo để kiểm tra
		System.out.println("StaticBlockSingleton instance created!");

		// Lấy instance của Singleton
		LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance();

		// In ra thông báo để kiểm tra
		System.out.println("LazyInitializedSingleton instance created!");

		// Lấy instance của Singleton theo cách thread-safe
		ThreadSafeSingleton singleton3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

		// In ra thông báo để kiểm tra
		System.out.println("ThreadSafeSingleton instance created!");

		// Lấy instance của Singleton theo cách Bill Pugh
		BillPughSingleton singleton4 = BillPughSingleton.getInstance();

		// In ra thông báo để kiểm tra
		System.out.println("BillPughSingleton instance created!");

		EnumSingleton singleton5 = EnumSingleton.INSTANCE;
		singleton5.doSomething();

		SerializedSingleton instanceOne = SerializedSingleton.getInstance();

		// Serialize to file
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instanceOne);
		out.close();

		// Deserialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
	}

}
