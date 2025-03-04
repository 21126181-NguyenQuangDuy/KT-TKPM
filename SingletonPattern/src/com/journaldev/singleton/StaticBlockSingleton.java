package com.journaldev.singleton;

public class StaticBlockSingleton {
    // Biến static để lưu instance duy nhất
    private static StaticBlockSingleton instance;
    
    // Constructor private để ngăn chặn tạo đối tượng từ bên ngoài
    private StaticBlockSingleton() {}
    
    // Khởi tạo instance trong static block để xử lý ngoại lệ
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    
    // Phương thức public static để lấy instance duy nhất
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
