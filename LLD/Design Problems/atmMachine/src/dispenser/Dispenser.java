package src.dispenser;

import src.ATMMachine;

public abstract class Dispenser {

    Dispenser nextDispenser;

    Dispenser(Dispenser dispenser){
        this.nextDispenser = dispenser;
    }

    public void process(ATMMachine atmMachine, int amount){
        if(nextDispenser != null){
            this.nextDispenser.process(atmMachine, amount);
        }else if(amount != 0){
            System.out.println("Can't dispense the complete amount");
        }
    }
}
