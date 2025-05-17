package singleton;

import card.Card;
import card.MasterCard;
import card.RuPayCard;
import card.VisaCard;

public class CardFactorLazyHolder {
  private CardFactorLazyHolder(){}

  private static class Holder{
    private static final CardFactorLazyHolder INSTANCE = new CardFactorLazyHolder();
  }

  public static CardFactorLazyHolder getInstance(){
    return Holder.INSTANCE;
  }

  public Card getCard(String cardType) {
    return switch (cardType.toUpperCase()) {
      case "VISA" -> new VisaCard();
      case "MASTERCARD" -> new MasterCard();
      case "RUPAY" -> new RuPayCard();
      default -> throw new IllegalArgumentException("Unknown card type: " + cardType);
    };
  }
}
