package GemminiPracticeClassInheritensMars.Units;

public abstract class MarsUnit {
    private String id;
    private int batteryLevel;
    private Status status;

    public MarsUnit(String id, int batteryLevel, Status status) {
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.status = status;
    }

    public void charge(){
        batteryLevel = 100;
        status = Status.IDLE;
    }

    abstract void executeMission();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MarsUnit: \n" +
                "id: " + id + "\n" +
                "batteryLevel: " + batteryLevel + "%\n" +
                "status: " + status;
    }


    }

