package basic;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private final List<Momento> history = new ArrayList<>();

    public void addMomento(Momento momento){
        history.add(momento);
    }
    public Momento getMomento(int index){
        return history.get(index);
    }
}
