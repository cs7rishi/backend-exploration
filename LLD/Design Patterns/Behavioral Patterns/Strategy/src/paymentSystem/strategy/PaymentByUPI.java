package paymentSystem.strategy;

public class PaymentByUPI implements PaymentStrategy {

  @Override
  public void processPayment(Double amount) {
    System.out.println("Payment of " + amount + " processed by UPI");
  }
}
