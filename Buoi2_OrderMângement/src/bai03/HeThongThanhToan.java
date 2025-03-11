package bai03;

public class HeThongThanhToan {
	public static void main(String[] args) {
        PhuongThucThanhToan theTinDung = new ThanhToanTheTinDung();
        PhuongThucThanhToan paypal = new ThanhToanPayPal();
        
        System.out.println("Thanh toán bình thường:");
        theTinDung.thanhToan(1000000);
        paypal.thanhToan(500000);
        
        System.out.println("\nThanh toán với phí xử lý:");
        PhuongThucThanhToan theTinDungPhi = new PhiXuLyThanhToan(new ThanhToanTheTinDung());
        theTinDungPhi.thanhToan(1000000);
        
        System.out.println("\nThanh toán với giảm giá:");
        PhuongThucThanhToan paypalGiamGia = new GiamGiaThanhToan(new ThanhToanPayPal());
        paypalGiamGia.thanhToan(500000);
        
        System.out.println("\nThanh toán với cả phí xử lý và giảm giá:");
        PhuongThucThanhToan theTinDungFull = new GiamGiaThanhToan(new PhiXuLyThanhToan(new ThanhToanTheTinDung()));
        theTinDungFull.thanhToan(1000000);
    }
}
