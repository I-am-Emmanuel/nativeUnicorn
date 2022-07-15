package tddClass;

public class UnicornGas {

    private boolean gasAvailable;
    private final double fuelPrice = 120;
    private double  amount;
    public final double discountInterest = 0.02;

    public  UnicornGas(boolean gasAvailable) {
        this.gasAvailable = gasAvailable;
    }

    public boolean buyGas() {
        if (gasAvailable) {
            return true;
        } else {
            return false; }
    }
    public boolean getGas() {
        return true;
    }
    public void buyFuel(int litre) {
        amount = (litre * fuelPrice) - (litre * fuelPrice * discountInterest);
        //please kindly refer to your instance variable for values of fuelPrice , Discount Interest.
    }
    public double getAmount() {
        return amount;
    }
}

