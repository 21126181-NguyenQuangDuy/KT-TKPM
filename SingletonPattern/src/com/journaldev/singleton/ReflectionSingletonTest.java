package com.journaldev.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        BillPughSingleton instanceOne = BillPughSingleton.getInstance();
        BillPughSingleton instanceTwo = null;
        
        try {
            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Phá hủy Singleton bằng Reflection
                constructor.setAccessible(true);
                instanceTwo = (BillPughSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo != null ? instanceTwo.hashCode() : "Instance creation blocked");
    }
}
