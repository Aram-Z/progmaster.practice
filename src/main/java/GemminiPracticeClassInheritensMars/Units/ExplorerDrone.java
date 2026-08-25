package GemminiPracticeClassInheritensMars.Units;

public class ExplorerDrone extends MarsUnit{

    public ExplorerDrone(String id, int batteryLevel, Status status) {
        super(id, batteryLevel, status);
    }

    @Override
    void executeMission() {
        System.out.println(getId() + "Felszíni szkennelés folyamatban...");
        if( getBatteryLevel() < 20){
            System.out.println("Az akumlátort lemerülöben, tölteni szükséges");
        } else if (getBatteryLevel() > 20) {
            setBatteryLevel(getBatteryLevel()-20);
        }

        }


    }
