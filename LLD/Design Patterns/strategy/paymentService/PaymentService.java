package strategy.paymentService;

public class PaymentService {
    public PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(){
        paymentStrategy.processPayment();
    }

    public static void main(String[] args) {
        PaymentService first = new PaymentService(new PaymentByCard());
        PaymentService second = new PaymentService(new PaymentByUPI());

        first.processPayment();
        second.processPayment();

    }
}
