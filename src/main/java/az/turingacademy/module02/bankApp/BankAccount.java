package az.turingacademy.module02.bankApp;

import java.util.Objects;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder,double balance, int accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transferred " + amount + " to Account Number: " + recipient.getAccountNumber());
        } else {
            System.out.println("Transfer failed. Check balance or amount.");
        }
    }
}
