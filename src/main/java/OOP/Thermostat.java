package OOP;

public class Thermostat {

    private int tempetur;

    public Thermostat(int tempetur) {

        this.tempetur = tempetur;

    }

    public int getTempetur() {

        return tempetur;

    }

    public void setTempetur(int tempetur) {

        if (tempetur < 12 || tempetur > 31) {

            this.tempetur = 12;

        } else {

            this.tempetur = tempetur;

        }


    }

    @Override
    public String toString() {
        return "Thermostat:  \n" +
                "Hömérséklet: " + tempetur;

    }
}


