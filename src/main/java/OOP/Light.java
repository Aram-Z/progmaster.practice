package OOP;

public class Light {
    private boolean lightIsOn = true;
    private int brightness;

    public Light( int brightness) {
        setBrightness(brightness);
    }

    public boolean isLightIsOn() {
        return lightIsOn;
    }

    public void setLightIsOn(boolean lightIsOn) {

        this.lightIsOn = lightIsOn;
    }
    public void turnOff(){
        this.lightIsOn = false;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if(brightness < 0 || brightness > 100 ){
            this.brightness = 0;
        }else {
            this.brightness = brightness;
        }
    }

    @Override
    public String toString() {
        return "Lámpa: \n" +
                "Lámpa felkapcsolva: " + (lightIsOn? "igen" : "nem") + "\n" +
                "Fényerő: " + brightness ;
    }
}


