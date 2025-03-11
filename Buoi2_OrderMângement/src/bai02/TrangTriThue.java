package bai02;

public class TrangTriThue implements ChienLuocThue {
	protected ChienLuocThue thueDuocTrangTri;

	public TrangTriThue(ChienLuocThue thueDuocTrangTri) {
		this.thueDuocTrangTri = thueDuocTrangTri;
	}

	public double tinhThue(double gia) {
		return thueDuocTrangTri.tinhThue(gia);
	}
}

class ThueGiamGia extends TrangTriThue {
	public ThueGiamGia(ChienLuocThue thueDuocTrangTri) {
		super(thueDuocTrangTri);
	}

	public double tinhThue(double gia) {
		return super.tinhThue(gia) * 0.9; // Giảm 10% thuế
	}
}
