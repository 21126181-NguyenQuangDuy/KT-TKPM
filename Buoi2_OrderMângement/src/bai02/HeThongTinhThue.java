package bai02;

public class HeThongTinhThue {
	public static void main(String[] args) {
        SanPham sp1 = new SanPham("Laptop", 20000000, new ThueVAT());
        SanPham sp2 = new SanPham("Rượu ngoại", 5000000, new ThueTieuThuDacBiet());
        SanPham sp3 = new SanPham("Đồng hồ Rolex", 100000000, new ThueXaXi());
        
        sp1.hienThiThongTin();
        sp2.hienThiThongTin();
        sp3.hienThiThongTin();
        
        // Sử dụng Decorator để giảm thuế
        SanPham sp4 = new SanPham("Tivi", 15000000, new ThueGiamGia(new ThueVAT()));
        sp4.hienThiThongTin();
    }
}
