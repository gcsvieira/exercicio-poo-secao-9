package application;

import java.util.Scanner;

import entities.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        BankAccount bankAccount;
        int idAccount;
        String nameAccount;
        double initialDeposit;

        System.out.print("Enter account number: ");
        idAccount = Integer.parseInt(scan.nextLine());
        System.out.print("Enter account holder: ");
        nameAccount = scan.nextLine();
        System.out.print("Is there an initial deposit? (y/n): ");
        if (scan.nextLine().equals("y")) {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = Double.parseDouble(scan.nextLine());
            bankAccount = new BankAccount(idAccount, nameAccount, initialDeposit);
        } else {
            bankAccount = new BankAccount(idAccount, nameAccount);
        }

        System.out.println("\nAccount data: \n" + bankAccount);

        System.out.println("Enter a deposit value: ");
        bankAccount.deposit(Double.parseDouble(scan.nextLine()));
        System.out.println("\nUpdated data: \n" + bankAccount);

        System.out.println("\nEnter a withdraw value: ");
        bankAccount.withdraw(Double.parseDouble(scan.nextLine()));
        System.out.println("\nUpdated data: \n" + bankAccount);

        bankAccount.setNameAccount(nameAccount);

        scan.close();
    }
}
