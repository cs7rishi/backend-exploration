package trafficLight;

public class TrafficLightContext {
    TrafficLightState trafficLightState;

    TrafficLightContext(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;

    }

    void setTrafficLightState(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }

    void changeLight(){
        trafficLightState.handle(this);
    }
}
