import card.Card;
import singleton.CardFactory;

public class Main {

  public static void main(String[] args) {
    CardFactory factory = CardFactory.getInstance();

    Card card1 = factory.getCard("VISA");
    card1.makePayment(1200.0);

    Card card2 = factory.getCard("MASTERCARD");
    card2.makePayment(800.0);
  }
}
