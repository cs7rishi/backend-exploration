package basic;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("State set to : " + state);
    }

    public Momento takeSnapshot(){
        return new Momento(state);
    }

    void restore(Momento momento){
        this.state = momento.getState();
        System.out.println("State restored to: " + this.state);
    }
}
