package objectorientedprogramming;

/*
 * Program: BankAccount
 * Module: Object-Oriented Programming
 * Purpose: Demonstrates OOP concepts using a simple bank account
 * with encapsulated data and methods for deposits and withdrawals.
 */

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Emmanuel", 1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccount();
    }
}
