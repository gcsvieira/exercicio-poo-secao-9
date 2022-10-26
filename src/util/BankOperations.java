package util;

public abstract class BankOperations {
    protected static final double WITHDRAW_TAX = 5.00;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
