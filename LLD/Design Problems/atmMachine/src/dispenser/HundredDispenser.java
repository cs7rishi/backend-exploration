package src.dispenser;

import src.ATMMachine;

public class HundredDispenser extends Dispenser{
    int value = 100;

    public HundredDispenser(Dispenser dispenser) {
        super(dispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, int amount) {
        int hundredNotes = Math.min(amount / value, atmMachine.getHundredNotes());
        System.out.println(hundredNotes + " " + value + " Notes");
        atmMachine.deductHundredNotes(hundredNotes);
        super.process(atmMachine, amount - hundredNotes*value);
    }
}
