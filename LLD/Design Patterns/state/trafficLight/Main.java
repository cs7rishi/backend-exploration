package trafficLight;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightContext context = new TrafficLightContext(new RedLightState());

        for(int i = 0 ; i < 6 ; i++){
            context.changeLight();
            Thread.sleep(5000);
        }
    }
}
