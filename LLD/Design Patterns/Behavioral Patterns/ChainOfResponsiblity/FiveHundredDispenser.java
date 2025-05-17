public class FiveHundredDispenser extends Dispenser{
    FiveHundredDispenser(Dispenser nextHandler) {
        super(nextHandler);
    }

    public void process(Integer amount){
        int notes = amount / 500;

        if(notes != 0){
            System.out.println(notes + " of 500 notes");
        }

        super.process(amount % 500);
    }
}
