package textEditor;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private final List<DocumentMomento> history = new ArrayList<>();

    public void saveSnapShot(DocumentMomento momento){
        this.history.add(momento);
    }

    public DocumentMomento getMemento(int index){
        return history.get(index);
    }
}
