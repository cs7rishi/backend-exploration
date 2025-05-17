package card;

public class MasterCard implements Card {

  @Override
  public void makePayment(double amount) {
    System.out.println("Paid ₹" + amount + " using MasterCard.");
  }
}
