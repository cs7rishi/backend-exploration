package card;

public class RuPayCard implements Card {

  @Override
  public void makePayment(double amount) {
    System.out.println("Paid ₹" + amount + " using RuPay Card.");
  }
}
