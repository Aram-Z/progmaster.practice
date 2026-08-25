package GemminiPracticeClassInheritensMars.Units;

public class BuilderRover extends MarsUnit{

    public BuilderRover(String id, int batteryLevel, Status status) {
        super(id, batteryLevel, status);
    }

    @Override
    void executeMission() {
        System.out.println(getId() + "Alapzat építése a kráterben...");
        if( getBatteryLevel() < 20){
            System.out.println("Az akumlátort lemerülöben, tolteni szükséges");
        } else if (getBatteryLevel() > 20) {
            setBatteryLevel(getBatteryLevel()-20);
        }

    }


}
