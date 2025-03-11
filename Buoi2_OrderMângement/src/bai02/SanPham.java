package bai02;

public class SanPham {
	private String ten;
    private double gia;
    private ChienLuocThue chienLuocThue;
    
    public SanPham(String ten, double gia, ChienLuocThue chienLuocThue) {
        this.ten = ten;
        this.gia = gia;
        this.chienLuocThue = chienLuocThue;
    }
    
    public double tinhGiaSauThue() {
        return gia + chienLuocThue.tinhThue(gia);
    }
    
    public void hienThiThongTin() {
        System.out.println("Sản phẩm: " + ten + ", Giá sau thuế: " + tinhGiaSauThue());
    }
}
