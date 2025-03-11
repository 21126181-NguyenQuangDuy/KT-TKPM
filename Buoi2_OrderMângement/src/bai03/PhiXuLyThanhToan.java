package bai03;

public class PhiXuLyThanhToan extends TrangTriThanhToan{
	public PhiXuLyThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
        super(phuongThucThanhToan);
    }
    
    public void thanhToan(double soTien) {
        double phi = soTien * 0.02; // Phí xử lý 2%
        System.out.println("Thêm phí xử lý: " + phi);
        super.thanhToan(soTien + phi);
    }
}
