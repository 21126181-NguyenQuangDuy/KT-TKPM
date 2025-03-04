package com.journaldev.singleton;

public class BillPughSingleton {
    // Constructor private để ngăn chặn tạo đối tượng từ bên ngoài
    private BillPughSingleton() {}
    
    // Lớp static helper chứa instance của Singleton
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    // Phương thức public để lấy instance duy nhất
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

