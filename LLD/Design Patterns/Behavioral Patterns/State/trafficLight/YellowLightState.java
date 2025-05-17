package trafficLight;

public class YellowLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLightContext trafficLightContext) {
        System.out.println("SLOW DOWN !!");
        trafficLightContext.setTrafficLightState(new RedLightState());
    }
}
