package GemminiPracticeClassInheritensMars.Buildings;

public abstract class Building {

    private String name;
    private int integrity;
    private boolean isShieldActive;

    public Building(String name, int integrity, boolean isShieldActive) {
        this.name = name;
        this.integrity = integrity;
        this.isShieldActive = isShieldActive;
    }

    public void takeDamage(HazardType hazardType){

        switch (hazardType){

            case RADIATION_STORM:
                if (this.isShieldActive == false) {
                    this.integrity -= 350;

                } else {
                    this.integrity -= 180;

                }

                break;

            case ALIEN_ANOMALY:
                if (this.isShieldActive == false) {
                    this.integrity -= 200;

                } else {
                    this.integrity -= 75;

                }

                break;

            case METEOR_IMPACT:
                if (this.isShieldActive == false) {
                    this.integrity -= 450;

                } else {
                    this.integrity -= 300;

                }

                break;


        }


    }

    public abstract void repairIntegrity();

    public void shildUp(){
        this.isShieldActive = true;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public boolean isShieldActive() {
        return isShieldActive;
    }

    public void setShieldActive(boolean shieldActive) {
        isShieldActive = shieldActive;
    }
}
