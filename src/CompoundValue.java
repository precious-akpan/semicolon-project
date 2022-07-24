//A program to calculate monthly compounding interest

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly savings amount: ");
        double monthlySavings = input.nextDouble();

        System.out.print("How many months do you plan to save: ");
        int numberOfMonth = input.nextInt();

        double monthlyInterestRate = 0.00417;
        double accountValue = 0;
        if (numberOfMonth > 1) {
            for (int i = 1; i <= numberOfMonth; i++) {
                accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);
            }
        } else {
            accountValue = monthlySavings * (1 + monthlyInterestRate);
        }
        System.out.printf("%nAfter %d month(s), your account value will be %.2f", numberOfMonth, accountValue);
    }
}
