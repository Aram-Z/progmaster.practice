package GemminiPracticeClassInheritensMars.Buildings;

public class SolarPanel extends Building{

    private int Energy = 0;


    public SolarPanel() {
        super("SolarPanel", 550, false);
    }

    public void repairIntegrity() {
        if (getIntegrity() + 50 >= 550 ) {
            this.setIntegrity(550);
            setEnergy(getEnergy() - 10);
        } else {
            setIntegrity(getIntegrity() + 50);
            setEnergy(getEnergy() - 15);
        }
    }


    public void makeEnergy() {
        if (getEnergy() + 25 >= 500) {
            setEnergy(500);
        }else setEnergy(getEnergy() + 25);
    }

    // ezt még nem tudom, mire mennyi energiát fog használni,
    // valoszinüleg egy enumban rögzitem majd mi mennyit használ
    public void useEnergy(){

    }

    public void shieldGenerator() {
        if (isShieldActive() == true && getEnergy() - 8 >= 0) {
            setEnergy(getEnergy() - 8);

        } else if (isShieldActive() == false && getEnergy() > 8) {
            System.out.println(" Az energiaszint elérte a pajzs bekapcsolásához szükséges szintet!"
                    + "\n" + "Pajzs automatikusan bekapcsolt.");
            setShieldActive(true);
        }
     else {
            setShieldActive(false);
            System.out.println("Pajzs kikapcsolva! Nem elég az Energia");
        }
    }

    public int getEnergy() {
        return Energy;
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }
}
