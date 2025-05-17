public class FiftyDispenser extends Dispenser{

    FiftyDispenser(Dispenser nextHandler) {
        super(nextHandler);
    }

    public void process(Integer amount){
        int notes = amount / 50;

        if(notes != 0){
            System.out.println(notes + " of 50 notes");
        }

        super.process(amount % 50);
    }
}
