package OOP;

public class SmartLock {
    private String pin;
    private boolean locked;

    public SmartLock(String pin) {
        this.pin = pin;
        this.locked = true;
    }

    public boolean isLocked() {
        return locked;
    }

    public void unlock(String inputPin) {
        if (this.pin.equals(inputPin)) {
            this.locked = false;
        } else {
            System.out.println("Hibás PIN!");
        }
    }

    public void lock() {
        this.locked = true;
    }

    @Override
    public String toString() {
        return "SmartLock: \n " +
                "Zárva: " + (locked? "igen" : "nem" ) ;
    }
}