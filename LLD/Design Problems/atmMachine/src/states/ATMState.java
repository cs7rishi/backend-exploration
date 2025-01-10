package src.states;

import jdk.dynalink.Operation;
import src.ATMCard;
import src.ATMMachine;
import src.OperationType;

public abstract class ATMState {
    public void insertCard(ATMMachine atmMachine, ATMCard atmCard){
        System.out.println("Not allowed");
    }

    public void authenticatePin(ATMMachine atmMachine, ATMCard atmCard, int pin){
        System.out.println("Not allowed");
    }

    public void selectOperation(ATMMachine atmMachine, ATMCard atmCard, OperationType operationType){
        System.out.println("Not allowed");
    }

    public void cashWithdrawal(ATMMachine atmMachine, ATMCard atmCard, int amount){
        System.out.println("Not allowed");
    }

    public void displayBalance(ATMMachine atmMachine, ATMCard atmCard){
        System.out.println("Not allowed");
    }

    public void ejectCard(ATMMachine atmMachine){
        System.out.println("Not allowed");
    }

    public void exit(ATMMachine atmMachine){
        System.out.println("Not allowed");
    }
}
