package src.states;

import src.ATMCard;
import src.ATMMachine;

public class CheckBalanceState extends ATMState{
    @Override
    public void displayBalance(ATMMachine atmMachine, ATMCard atmCard) {
        System.out.println("Current account balance is: " + atmCard.getBankAccount().getBalance());
        exit(atmMachine);
    }

    @Override
    public void ejectCard(ATMMachine atmMachine) {
        System.out.println("Ejecting the card");
        atmMachine.setCurrentState(new IdleState());
    }

    @Override
    public void exit(ATMMachine atmMachine) {
        ejectCard(atmMachine);
    }
}
