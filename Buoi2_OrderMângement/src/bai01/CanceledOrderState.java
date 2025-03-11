package bai01;

public class CanceledOrderState implements OrderState{

	@Override
	public void handle(OrderContext context) {
		System.out.println("Đơn hàng đã bị hủy. Đang xử lý hoàn tiền...");
	}

}
