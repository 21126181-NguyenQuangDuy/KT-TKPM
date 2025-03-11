package bai01;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void processPayment() {
		System.out.println("Xử lý thanh toán qua thẻ tín dụng...");
	}

}
