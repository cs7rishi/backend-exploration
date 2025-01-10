package src;

import java.util.Date;
import java.util.UUID;

public class ATMCard {
    private UUID uuid;
    private BankAccount bankAccount;
    private Date expiryDate;
    private String cardNumber;
    private Integer pin;
    private Integer cvv;

    public ATMCard(BankAccount bankAccount, Date expiryDate, String cardNumber,
        Integer pin, Integer cvv) {
        this.uuid = UUID.randomUUID();
        this.bankAccount = bankAccount;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
    }

    public boolean isPinCorrect(int pin){
        return this.pin == pin;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }


}
