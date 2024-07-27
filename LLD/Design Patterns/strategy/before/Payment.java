package strategy.before;

public class Payment {
    void processPayment(String paymentMethod){
        if("UPI".equals(paymentMethod)){
            System.out.println("Payment is done by UPI");
        }else if ("CARD".equals(paymentMethod)){
            System.out.println("Payment is done by CARD");
        }
        //Note: If new method introduced, updation would be required,
        //Violating Open/Closed Principle.
    }
}
