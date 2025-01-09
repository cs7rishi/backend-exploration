package chainOfResponsiblity;

public class TenHandler extends Dispenser {
    TenHandler(Dispenser nextHandler) {
        super(nextHandler);
    }
    public void process(Integer amount){
        int notes = amount / 10;

        if(notes != 0){
            System.out.println(notes + " of 10 notes");
        }

        super.process(amount % 10);
    }
}
