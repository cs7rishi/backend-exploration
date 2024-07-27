package observer.latest.impl;

import observer.latest.Observer;
import observer.latest.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addListener(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeListener(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyListeners() {
        for (Observer observer : observers){
            observer.update(weather);
        }
    }

    public void setWeather(String weather){
        this.weather = weather;
        notifyListeners();
    }
}
