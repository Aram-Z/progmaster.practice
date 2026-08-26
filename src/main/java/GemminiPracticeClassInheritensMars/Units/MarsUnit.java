package GemminiPracticeClassInheritensMars.Units;

public abstract class MarsUnit {
    private String id;
    private int batteryLevel;
    private Status status;
    private int hp;
    private int attackLevel;

    public MarsUnit(String id, int batteryLevel, Status status, int hp,int attackLevel) {
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.status = status;
        this.hp = hp;
        this.attackLevel = attackLevel;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "MarsUnit: \n" +
                "id: " + id + "\n" +
                "batteryLevel: " + batteryLevel + "%\n" +
                "status: " + status;
    }


    }

