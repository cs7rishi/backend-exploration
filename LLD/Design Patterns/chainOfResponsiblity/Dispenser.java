package chainOfResponsiblity;

public abstract class Dispenser {
    private Dispenser nextDispenser;

    Dispenser(Dispenser nextHandler){
        this.nextDispenser = nextHandler;
    }

    public void process(Integer amount){
        if(nextDispenser != null){
            nextDispenser.process(amount);
        }else if(amount != 0){
            System.out.println("Not suitable Dispenser for remaining " + amount +  " amount");
        }
    }
}
