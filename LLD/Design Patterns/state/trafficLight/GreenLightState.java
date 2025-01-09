package trafficLight;

public class GreenLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLightContext trafficLightContext) {
        System.out.println("GO !!");
        trafficLightContext.setTrafficLightState(new YellowLightState());
    }
}
