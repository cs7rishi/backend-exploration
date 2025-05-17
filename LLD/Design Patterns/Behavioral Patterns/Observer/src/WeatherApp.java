package src;

import src.impl.PhoneDisplay;
import src.impl.TVDisplay;
import src.impl.WeatherStation;

public class WeatherApp {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();

        weatherStation.addListener(phoneDisplay);
        weatherStation.addListener(tvDisplay);

        weatherStation.setWeather("Windy");

        Thread.sleep(5000);

        weatherStation.setWeather("stormy");

    }
}
