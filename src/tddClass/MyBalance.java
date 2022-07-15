package tddClass;

public class MyBalance {
    private int money;

    public void withDrawal(int amount) {
        money = money - amount;
    }

    public int getmoney() {
        return money;
    }
}

