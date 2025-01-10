package src;

import src.states.ATMState;
import src.states.IdleState;

import java.util.UUID;

public class ATMMachine {
    private UUID uuid;
    private int balance;
    private int fiftyNotes;
    private int hundredNotes;
    private int fiveHundredNotes;
    private int thousandNotes;
    private ATMState currentState;

    public ATMMachine(int fiftyNotes, int hundredNotes, int fiveHundredNotes,
        int thousandNotes) {
        this.uuid = UUID.randomUUID();
        this.fiftyNotes = fiftyNotes;
        this.hundredNotes = hundredNotes;
        this.fiveHundredNotes = fiveHundredNotes;
        this.thousandNotes = thousandNotes;

        this.currentState = new IdleState();
        this.balance =
            fiftyNotes * 50 + hundredNotes * 100 + fiveHundredNotes * 500 + thousandNotes * 1000;
    }

    public int getBalance() {
        return balance;
    }

//    public void setBalance(int balance) {
//        this.balance = balance;
//    }

    public int getFiftyNotes() {
        return fiftyNotes;
    }

    public void deductFiftyNotes(int cnt){
        this.thousandNotes -= cnt;
        this.balance -= cnt * 50;
    }

    public int getHundredNotes() {
        return hundredNotes;
    }

    public void deductHundredNotes(int cnt){
        this.thousandNotes -= cnt;
        this.balance -= cnt * 100;
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public void deductFiveHundredNotes(int cnt){
        this.thousandNotes -= cnt;
        this.balance -= cnt * 500;
    }

    public int getThousandNotes() {
        return thousandNotes;
    }

    public void deductThousandNotes(int cnt){
        this.thousandNotes -= cnt;
        this.balance -= cnt * 1000;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }
}
