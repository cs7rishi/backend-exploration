package basic;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        careTaker.addMomento(originator.takeSnapshot());

        originator.setState("State 2");
        careTaker.addMomento(originator.takeSnapshot());

        originator.restore(careTaker.getMomento(0));
    }
}
