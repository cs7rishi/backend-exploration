package src.states;

import src.ATMCard;
import src.ATMMachine;

public class IdleState extends ATMState{

    @Override
    public void insertCard(ATMMachine atmMachine, ATMCard atmCard){
        System.out.println("Card is inserted Successfully");
        atmMachine.setCurrentState(new HasCardState());
    }
}
