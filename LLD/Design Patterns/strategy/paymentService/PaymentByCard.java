package strategy.paymentService;

public class PaymentByCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment processed by Card");
    }
}