package GemminiPracticeClassInheritensMars.Units;

public enum DroneCharacteristics {
    EXPLORERDRONE(100, 3),
    BUILDERDRONE(180, 9),
    ATTACKDRONE(250, 25);

    private final int hp;
    private final int damage;

    DroneCharacteristics(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }
}