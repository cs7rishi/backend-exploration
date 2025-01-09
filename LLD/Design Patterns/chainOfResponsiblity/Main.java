package chainOfResponsiblity;

public class Main {

    public static void main(String[] args) {
        int amount = 5793;
        Dispenser atm = new ThousandDispenser(new FiveHundredDispenser(new OneHundredDispenser(new FiftyDispenser(new TenHandler(null)))));
        atm.process(amount);
    }
}
