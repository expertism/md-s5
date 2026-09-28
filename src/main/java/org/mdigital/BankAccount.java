package org.mdigital;

public class BankAccount {
    public int balance;

    public BankAccount(int balance) { // constructor does NOT return a value
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Balance: " + this.balance;
    }
}
