package src.dispenser;

import src.ATMMachine;

public class ThousandDispenser extends Dispenser{
    int value = 1000;

    public ThousandDispenser(Dispenser dispenser) {
        super(dispenser);
    }

    @Override
    public void process(ATMMachine atmMachine, int amount) {
        int thousandNotes = Math.min(amount / value, atmMachine.getThousandNotes());

        System.out.println(thousandNotes + " " + value + " Notes");
        atmMachine.deductThousandNotes(thousandNotes);
        super.process(atmMachine, amount - thousandNotes*value);
    }
}
