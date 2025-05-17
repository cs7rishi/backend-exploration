package paymentSystem.factory;

import paymentSystem.strategy.PaymentByCard;
import paymentSystem.strategy.PaymentByUPI;
import paymentSystem.strategy.PaymentStrategy;

public class PaymentStrategyFactory {

  public static PaymentStrategy getPaymentStrategy(String paymentMethod) {
    return switch (paymentMethod.toUpperCase()) {
      case "CREDIT_CARD" -> new PaymentByCard();
      case "UPI" -> new PaymentByUPI();
      default -> throw new IllegalArgumentException("Unsupported payment type: " + paymentMethod);
    };
  }
}
