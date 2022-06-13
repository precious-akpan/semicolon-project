package chapter4exercises.main;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter account number or 0 to end: ");
        int accountNumber = scanner.nextInt();

        if (accountNumber != 0) {
            System.out.println("enter balance at beginning of the month or 0 to end: ");
            int beginningMonth = scanner.nextInt();

            if (beginningMonth != 0) {
                System.out.println("enter charges for the month or 0 to end: ");
                int charges = scanner.nextInt();

                if (charges != 0) {
                    System.out.println("enter credit limit  for the month or 0 to end: ");
                    int credit = scanner.nextInt();

                    int newBalance = beginningMonth + charges - credit;
                    if (newBalance > 0) {
                        System.out.println(" new balance is " + newBalance);
                    } else {
                        System.out.println(" credit limit exceeded");
                    }
                } else {
                    System.out.println("no credit provided");
                }
            } else {
                System.out.println(" no charges provided");
            }
        } else {
            System.out.println("no account details were provided");
        }
    }
}

