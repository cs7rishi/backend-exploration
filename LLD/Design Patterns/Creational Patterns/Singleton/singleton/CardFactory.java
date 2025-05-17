package singleton;

import card.*;

public class CardFactory {

  private static CardFactory instance;
  private CardFactory(){

  }
  public static CardFactory getInstance(){
    if(instance == null){
      instance = new CardFactory();
    }
    return instance;
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
