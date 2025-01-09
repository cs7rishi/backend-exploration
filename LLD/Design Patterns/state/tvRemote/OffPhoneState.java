package tvRemote;

public class OffPhoneState implements PhoneState {
    @Override
    public void pressPowerButton() {
        System.out.println("Phone switched ON");
    }
}
