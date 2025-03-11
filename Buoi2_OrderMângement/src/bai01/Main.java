package bai01;

public class Main {
	public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.process();
        order.process();
        order.process();

        // Payment Strategy
        PaymentStrategy payment = new CreditCardPayment();
        payment.processPayment();
        
        // Decorator Usage
        OrderState priorityOrder = new PriorityOrderDecorator(new NewOrderState());
        priorityOrder.handle(new OrderContext());
    }
}
