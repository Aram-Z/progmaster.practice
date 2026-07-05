package OOP;

public class SmartHome {

   private SmartLock zar;
   private Light lampa ;
   private Thermostat termosztat;

public void leaveHome(){
    this.zar.lock();
    this.termosztat.setTempetur(16);
    this.lampa.turnOff();

}
public void arriveHome(){
    this.zar.unlock("1234");
    this.termosztat.setTempetur(21);
    this.lampa.setLightIsOn(true);
    this.lampa.setBrightness(100);

}
    public SmartHome() {
        this.zar = new SmartLock("1234");
        this.lampa = new Light(50);
        this.termosztat = new Thermostat(20);
    }

    public SmartHome(SmartLock zar, Light lampa, Thermostat termosztat) {
        this.zar = zar;
        this.lampa = lampa;
        this.termosztat = termosztat;
    }

    @Override
    public String toString() {
        return "Ház álapota: \n" +
                "zár: " + zar + "\n" +
                "lámpa: " + lampa + "\n" +
                "termosztát: " + termosztat;
    }
}
