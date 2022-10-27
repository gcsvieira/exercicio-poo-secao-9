package entities;

import util.BankOperations;

public class BankAccount extends BankOperations {
    private int idAccount;
    private String nameAccount;
    private double bankBalanceAccount;

    public BankAccount(int idAccount, String nameAccount, double initialDeposit) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        deposit(initialDeposit);
    }

    public BankAccount(int idAccount, String nameAccount) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.bankBalanceAccount = 0.00;
    }

    public int getIdAccount() {
        return this.idAccount;
    }

    public String getNameAccount() {
        return this.nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getBankBalanceAccount() {
        return this.bankBalanceAccount;
    }

    @Override
    public String toString() {
        return "Account " + getIdAccount()
                + ", Holder: " + getNameAccount()
                + ", Balance: " + getBankBalanceAccount();
    }

    @Override
    public void deposit(double amount) {
        bankBalanceAccount += amount;
    }

    @Override
    public void withdraw(double amount) {
        bankBalanceAccount -= (amount + WITHDRAW_TAX);
    }
}
