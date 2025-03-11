package bai01;

public class PriorityOrderDecorator extends OrderDecorator{
	public PriorityOrderDecorator(OrderState decoratedOrder) {
        super(decoratedOrder);
    }
    
    public void handle(OrderContext context) {
        System.out.println("Xử lý đơn hàng ưu tiên!");
        super.handle(context);
    }
}
