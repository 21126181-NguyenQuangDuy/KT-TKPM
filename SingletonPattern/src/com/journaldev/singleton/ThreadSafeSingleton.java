package com.journaldev.singleton;

public class ThreadSafeSingleton {
    // Biến static để lưu instance duy nhất
    private static ThreadSafeSingleton instance;
    
    // Constructor private để ngăn chặn tạo đối tượng từ bên ngoài
    private ThreadSafeSingleton() {}
    
    // Phương thức public synchronized để đảm bảo thread-safety
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    // Phương thức sử dụng Double-Checked Locking để tăng hiệu suất
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

