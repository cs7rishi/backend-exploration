package src.states;

import src.ATMCard;
import src.ATMMachine;

public class HasCardState extends ATMState{
    @Override
    public void authenticatePin(ATMMachine atmMachine, ATMCard atmCard, int pin) {
        if(atmCard.isPinCorrect(pin)){
            System.out.println("Successfully Authenticated");
            atmMachine.setCurrentState(new SelectOperationState());
        }else{
            System.out.println("Incorrect Pin");
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
