package com.mapinterface;

import java.util.*;

class BankingSystem {
    // HashMap to store account number -> balance
    private HashMap<String, Double> accounts;
    // TreeMap to store customers sorted by their balance
    private TreeMap<Double, List<String>> sortedAccounts;
    // Queue to process withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Method to create a new account
    public void createAccount(String accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists for " + accountNumber);
        } else {
            accounts.put(accountNumber, initialBalance);
            sortedAccounts.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
            System.out.println("Account created for " + accountNumber + " with balance: " + initialBalance);
        }
    }

    // Method to make a deposit
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            double oldBalance = accounts.get(accountNumber);
            accounts.put(accountNumber, newBalance);

            // Remove the account from the old balance list and add to the new balance list
            sortedAccounts.get(oldBalance).remove(accountNumber);
            sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
            System.out.println("Deposited " + amount + " into " + accountNumber + ". New balance: " + newBalance);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Method to create a withdrawal request and add to the queue
    public void requestWithdrawal(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
            System.out.println("Withdrawal request of " + amount + " for account " + accountNumber + " added to the queue.");
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Method to process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            String accountNumber = request.getAccountNumber();
            double withdrawalAmount = request.getAmount();
            double balance = accounts.get(accountNumber);

            if (balance >= withdrawalAmount) {
                // Process withdrawal
                double newBalance = balance - withdrawalAmount;
                accounts.put(accountNumber, newBalance);

                // Update the TreeMap with the new balance
                sortedAccounts.get(balance).remove(accountNumber);
                sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);

                System.out.println("Withdrawal of " + withdrawalAmount + " processed for account " + accountNumber + ". New balance: " + newBalance);
            } else {
                System.out.println("Insufficient balance for account " + accountNumber + " to withdraw " + withdrawalAmount);
            }
        }
    }

    // Method to display customers sorted by balance
    public void displaySortedByBalance() {
        System.out.println("Customers sorted by balance:");
        for (Map.Entry<Double, List<String>> entry : sortedAccounts.entrySet()) {
            for (String accountNumber : entry.getValue()) {
                System.out.println("Account: " + accountNumber + " Balance: " + entry.getKey());
            }
        }
    }

    // Inner class to represent a withdrawal request
    static class WithdrawalRequest {
        private String accountNumber;
        private double amount;

        public WithdrawalRequest(String accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Create accounts
        bankingSystem.createAccount("A1001", 500.0);
        bankingSystem.createAccount("A1002", 300.0);
        bankingSystem.createAccount("A1003", 800.0);

        // Make deposits
        bankingSystem.deposit("A1001", 200.0);
        bankingSystem.deposit("A1002", 100.0);

        // Create withdrawal requests
        bankingSystem.requestWithdrawal("A1001", 150.0);
        bankingSystem.requestWithdrawal("A1002", 50.0);
        bankingSystem.requestWithdrawal("A1003", 1000.0);  // Insufficient balance

        // Process withdrawals
        bankingSystem.processWithdrawals();

        // Display sorted customers by balance
        bankingSystem.displaySortedByBalance();
    }
}
