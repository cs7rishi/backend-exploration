package paymentSystem;

import paymentSystem.strategy.PaymentStrategy;

public class PaymentProcessor {

  public PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void processPayment(Double amount) {
    if (paymentStrategy == null) {
      throw new IllegalStateException("Payment strategy is not set");
    }
    paymentStrategy.processPayment(amount);
  }
}
