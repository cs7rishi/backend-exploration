package observer.latest.impl;

import observer.latest.Observer;

public class TVDisplay implements Observer {
    String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        this.display();
    }
    private void display(){
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
