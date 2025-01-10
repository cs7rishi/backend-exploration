package src.states;

import src.ATMCard;
import src.ATMMachine;
import src.OperationType;

public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        System.out.println("Select one of the following operations");
        System.out.println("1. Cash Withdrawal");
        System.out.println("2. Display Balance");

    }

    @Override
    public void selectOperation(ATMMachine atmMachine, ATMCard atmCard,
        OperationType operationType) {
        switch (operationType) {
            case CASH_WITHDRAWAL:
                atmMachine.setCurrentState(new CashWithdrawalState());
                break;
            case DISPLAY_BALANCE:
                atmMachine.setCurrentState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid operation type");
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
