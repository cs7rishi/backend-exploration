public class ThousandDispenser extends  Dispenser{

    ThousandDispenser(Dispenser nextHandler) {
        super(nextHandler);
    }

    public void process(Integer amount){
        int notes = amount / 1000;

        if(notes != 0){
            System.out.println(notes + " of 1000 notes");
        }

        super.process(amount % 1000);
    }
}
