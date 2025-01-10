package src.dispenser;

import src.ATMMachine;

public class FiveHundredDispenser extends Dispenser {
    int value = 500;

    public FiveHundredDispenser(Dispenser dispenser) {
        super(dispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, int amount) {
        int fiveHundredNotes = Math.min(amount / value, atmMachine.getFiveHundredNotes());

        System.out.println(fiveHundredNotes + " " + value + " Notes");
        atmMachine.deductFiveHundredNotes(fiveHundredNotes);
        super.process(atmMachine, amount - fiveHundredNotes * value);
    }
}
