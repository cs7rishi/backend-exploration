package strategy.src.paymentSystem.factory;

import strategy.src.paymentSystem.strategy.PaymentByCard;
import strategy.src.paymentSystem.strategy.PaymentByUPI;
import strategy.src.paymentSystem.strategy.PaymentStrategy;

public class PaymentStrategyFactory {

  public static PaymentStrategy getPaymentStrategy(String paymentMethod) {
    return switch (paymentMethod.toUpperCase()) {
      case "CREDIT_CARD" -> new PaymentByCard();
      case "UPI" -> new PaymentByUPI();
      default -> throw new IllegalArgumentException("Unsupported payment type: " + paymentMethod);
    };
  }
}
