package tddClass;

public class UtmeDriller {
    private int perCopy = 2000;
    private int discount = 200;
    private int amount;
    public UtmeDriller(int perCopy, int discount){
    this.amount = amount;
    }
    public int purchase(int copy) {
        if (copy <= 4) {
            amount = perCopy * copy;
            return amount;
        } else if (copy <= 9) {
            amount = copy * (perCopy - discount);
            return amount;
        } else if (copy <= 29) {
            amount = copy * (perCopy - discount * 2);
            return amount;
        } else if (copy <= 49) {
            amount = copy * (perCopy - (discount * 3 - discount/2));
            return amount;
        } else if (copy <= 99) {
            amount = copy * (perCopy - (discount * 3 + discount / 2));
            return amount;
        } else if (copy <= 199) {
            amount = copy * (perCopy - (discount * 4));
            return amount;
        }else if (copy <= 499) {
            amount = copy * (perCopy - (discount * 4 + discount / 2));
            return amount;
        } else if (copy >= 500); {
            amount = copy * (perCopy / discount);
        }
        return amount;
    }
}
