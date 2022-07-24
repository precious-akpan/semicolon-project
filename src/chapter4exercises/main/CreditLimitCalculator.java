package chapter4exercises.main;

import chapter4exercises.ChargeAccount;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        ChargeAccount customer = new ChargeAccount();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter charge account number: ");
        customer.setAccountNumber(input.nextInt());

        System.out.println("Enter charge account current balance: ");
        customer.setBalance(input.nextInt());

        System.out.println("Enter total charges for the month: ");
        customer.setCharges(input.nextInt());

        System.out.println("Enter total credit applied to account for the month: ");
        customer.setCredit(input.nextInt());

        System.out.println("You new balance is :" + customer.calculateBalance());

        if (customer.getBalance() < customer.getCreditLimit()) {
            System.out.println("You have exceeded your credit limit");
        } else {
            System.out.println("You are still within your credit limit, happy shopping!");
        }
    }
}
