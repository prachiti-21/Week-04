package com.junit;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

