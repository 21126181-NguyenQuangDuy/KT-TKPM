package bai03;

public class TrangTriThanhToan implements PhuongThucThanhToan {
	protected PhuongThucThanhToan phuongThucThanhToan;

	public TrangTriThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}

	public void thanhToan(double soTien) {
		phuongThucThanhToan.thanhToan(soTien);
	}
}
