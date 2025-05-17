public class TenDispenser extends Dispenser {
    TenDispenser(Dispenser nextHandler) {
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
