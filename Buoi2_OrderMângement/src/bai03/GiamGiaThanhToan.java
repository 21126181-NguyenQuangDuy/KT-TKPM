package bai03;

public class GiamGiaThanhToan extends TrangTriThanhToan {
	public GiamGiaThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
		super(phuongThucThanhToan);
	}

	public void thanhToan(double soTien) {
		double giamGia = soTien * 0.1; // Giảm giá 10%
		System.out.println("Áp dụng giảm giá: " + giamGia);
		super.thanhToan(soTien - giamGia);
	}
}
