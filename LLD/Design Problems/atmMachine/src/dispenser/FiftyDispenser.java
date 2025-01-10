package src.dispenser;

import src.ATMMachine;

public class FiftyDispenser extends Dispenser{
    int value = 50;

    public FiftyDispenser(Dispenser dispenser) {
        super(dispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, int amount) {
        int fiftyNotes = Math.min(amount / value, atmMachine.getFiveHundredNotes());
        System.out.println(fiftyNotes + " " + value + " Notes");
        atmMachine.deductFiftyNotes(fiftyNotes);
        super.process(atmMachine, amount - fiftyNotes * value);
    }
}
