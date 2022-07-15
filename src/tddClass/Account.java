package tddClass;

import javax.swing.*;
import java.util.concurrent.LinkedTransferQueue;

public class Account {
    private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getbalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int newbalance() {
        return balance;
    }

    public String negativewithdraw(int amount) {
       balance = balance - amount;
        if (balance < amount);
            return "insufficient funds";
    }
    public String getnewbalance() {
        return "insufficient funds";
    }
}









