package factory;

import card.Card;
import card.MasterCard;
import card.RuPayCard;
import card.VisaCard;

public class CardFactory {

  public static Card getCard(String cardType) {
    return switch (cardType.toUpperCase()) {
      case "VISA" -> new VisaCard();
      case "MASTERCARD" -> new MasterCard();
      case "RUPAY" -> new RuPayCard();
      default -> throw new IllegalArgumentException("Unknown card type: " + cardType);
    };
  }
}
