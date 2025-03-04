package com.journaldev.singleton;

public class LazyInitializedSingleton {
    // Biến static để lưu instance duy nhất
    private static LazyInitializedSingleton instance;
    
    // Constructor private để ngăn chặn tạo đối tượng từ bên ngoài
    private LazyInitializedSingleton() {}
    
    // Phương thức public static để lấy instance duy nhất (Lazy Initialization)
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
