package strategy.src.paymentSystem;

import strategy.src.paymentSystem.factory.PaymentStrategyFactory;
import strategy.src.paymentSystem.strategy.PaymentByCard;
import strategy.src.paymentSystem.strategy.PaymentByUPI;

public class Main {


    public static void main(String[] args) {

        // Simulate runtime user input
        // could be read from UI, config, API, etc.
        //String userPaymentType = "UPI";
        String userPaymentType = "CREDIT_CARD"; // could be read from UI, config, API, etc.

        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(PaymentStrategyFactory.getPaymentStrategy(userPaymentType));
        processor.processPayment(500.43);
    }
}
