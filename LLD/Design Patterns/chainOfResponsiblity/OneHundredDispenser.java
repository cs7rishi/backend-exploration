package chainOfResponsiblity;

public class OneHundredDispenser extends Dispenser{

    OneHundredDispenser(Dispenser nextHandler) {
        super(nextHandler);
    }

    public void process(Integer amount){
        int notes = amount / 100;

        if(notes != 0){
            System.out.println(notes + " of 100 notes");
        }

        super.process(amount % 100);
    }
}
