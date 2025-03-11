package bai01;

public class DeliveredOrderState implements OrderState{
	public void handle(OrderContext context) {
        System.out.println("Đơn hàng đã giao thành công!");
    }
}
