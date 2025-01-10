package src.states;

import src.ATMCard;
import src.ATMMachine;
import src.dispenser.*;

public class CashWithdrawalState extends ATMState {
    @Override
    public void cashWithdrawal(ATMMachine atmMachine, ATMCard atmCard, int amount) {
        super.cashWithdrawal(atmMachine, atmCard, amount);
        if (atmCard.getBankAccount().getBalance() < amount) {
            System.out.println("Account does'nt have sufficient balance");
            exit(atmMachine);
        } else if (atmMachine.getBalance() < amount) {
            System.out.println("ATM does'nt have sufficient balance");
            exit(atmMachine);
        } else {
            //Todo
            //denomination possiblity

            //update account balance;
            atmCard.getBankAccount().withDrawBalance(amount);

            //update denomination
            //chain of responsibility design Pattern
            Dispenser dispenser = new ThousandDispenser(
                new FiveHundredDispenser(new HundredDispenser(new FiftyDispenser(null))));
            dispenser.process(atmMachine, amount);

            System.out.println("Cash Withdrawal Successfull " + amount);
            exit(atmMachine);
        }
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
