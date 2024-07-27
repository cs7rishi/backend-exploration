package strategy.paymentService;

public class PaymentByUPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment processed by UPI");
    }
}
