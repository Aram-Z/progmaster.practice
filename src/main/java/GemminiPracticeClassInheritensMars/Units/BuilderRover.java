package GemminiPracticeClassInheritensMars.Units;

public class BuilderRover extends MarsUnit{

    public BuilderRover(String id, int batteryLevel, Status status) {
        super("111", 111, Status.IDLE, 100, 0);
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
