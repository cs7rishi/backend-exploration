package tvRemote;

public class OnPhoneState implements PhoneState {
    @Override
    public void pressPowerButton() {
        System.out.println("Phone switched Off");
    }
}
