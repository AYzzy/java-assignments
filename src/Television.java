public class Television {
    private boolean isActive;
    private int volume;

    public void setActive() {
        isActive = true;
    }
    public void setInactive(){
        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setIncreaseInVolume(){
        int increase = 100;
        if(isActive){
            if(volume <= increase){
                volume++;
            }
        }
    }

    public int getVolumeIncrease() {
        return volume;
    }
    public void setDecreaseInVolume(){
        int decrease =100;
        if(isActive) {
            if (volume <= decrease) {
                volume--;
            }
        }
    }
    public int getVolumeDecrease(){
        return volume;
    }
}
