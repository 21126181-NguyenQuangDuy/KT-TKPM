package com.journaldev.singleton;

public enum EnumSingleton {
    INSTANCE;
    
    public void doSomething() {
        System.out.println("Enum Singleton is working!");
    }
}