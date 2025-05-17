package strategy.src.paymentSystem.strategy;

public class PaymentByCard implements PaymentStrategy {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Payment of " + amount + " processed by Card");
    }
}
