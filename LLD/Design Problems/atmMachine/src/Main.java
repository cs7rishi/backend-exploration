package src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(100,100,100,100);
        User user = new User("cs7rishi");
        BankAccount bankAccount = new BankAccount(user, 10000);
        ATMCard atmCard = new ATMCard(bankAccount, new Date(), "1234354", 1234, 543);


        atmMachine.getCurrentState().insertCard(atmMachine,atmCard);
        atmMachine.getCurrentState().authenticatePin(atmMachine,atmCard,1234);
        atmMachine.getCurrentState().selectOperation(atmMachine,atmCard, OperationType.CASH_WITHDRAWAL);
        atmMachine.getCurrentState().cashWithdrawal(atmMachine,atmCard,3000);
    }
}
