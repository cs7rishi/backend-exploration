package card;

public class VisaCard implements Card {

  @Override
  public void makePayment(double amount) {
    System.out.println("Paid ₹" + amount + " using Visa Card.");
  }
}
