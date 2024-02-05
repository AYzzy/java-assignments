public class Television {

    private boolean isOn;

    public void powerOn() {
        isOn = true;
    }
    public void powerOff(){
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
