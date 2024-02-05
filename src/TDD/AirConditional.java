package TDD;

public class AirConditional {
    private boolean isOn;
    private int increaseInTemperature;

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getIncreaseInTemperature(int rate) {
        increaseInTemperature = rate + 1;
        return rate;
    }

    public int getDecreaseInTemperature(int rate) {
        int decreaseInTemperature = rate - 1;
        return decreaseInTemperature;

    }

    public int getIncreaseBeyond30(int beyond) {
        int increase = 30;
        if (beyond > increase) {
            return increase;
        } else {
            return beyond;
        }
    }
    public int getDecreaseBelow16(int below) {
        int decrease = 16;
        if(below < decrease){
            return decrease;
        }else{
            return below;
        }
    }

}
