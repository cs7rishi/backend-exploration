package textEditor;


public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial Text");
        CareTaker careTaker = new CareTaker();

        careTaker.saveSnapShot(document.takeSnapShot());

        document.setText("Next Text");
        careTaker.saveSnapShot(document.takeSnapShot());

        document.restoreMomento(careTaker.getMemento(0));
    }
}
