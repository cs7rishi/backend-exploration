package trafficLight;

public class RedLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLightContext trafficLightContext) {
        System.out.println("STOP !!");
        trafficLightContext.setTrafficLightState(new GreenLightState());
    }
}
