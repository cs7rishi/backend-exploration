package tvRemote;

public class Phone {
    private PhoneState phoneState;

    Phone(PhoneState phoneState){
        this.phoneState = phoneState;
    }

    void setPhoneState(PhoneState phoneState){
        this.phoneState = phoneState;
    }

    void pressButton(){
        phoneState.pressPowerButton();
    }
}
