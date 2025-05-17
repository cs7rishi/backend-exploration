import card.Card;
import factory.CardFactory;

public class Main {
  public static void main(String[] args) {
    Card card = CardFactory.getCard("VISA");
    card.makePayment(1000.0);

    card = CardFactory.getCard("RUPAY");
    card.makePayment(500.0);
  }
}
