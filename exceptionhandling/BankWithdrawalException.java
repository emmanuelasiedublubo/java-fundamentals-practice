package exceptionhandling;

/*
 * Program: BankWithdrawalException
 * Module: Exception Handling
 * Purpose: Demonstrates a custom exception for handling
 * an attempted withdrawal that exceeds the account balance.
 */

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankWithdrawalException {

    private double balance;

    public BankWithdrawalException(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds for this withdrawal."
            );
        }

        balance -= amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        BankWithdrawalException account =
                new BankWithdrawalException(1000.0);

        try {

            account.withdraw(1500.0);

        } catch (InsufficientFundsException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}