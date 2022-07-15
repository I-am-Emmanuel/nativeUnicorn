package tddClass;

public class Autobike {
    private boolean power;

    public Autobike(boolean power){
        this.power = power;
    }

    public boolean turnbikeOn() {
        if (power) {
        return true;}
        else {
            return false;
        }
    }
    public boolean getpower() {
        return power;
    }

    }

