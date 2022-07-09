package chapter4exercises.main;

import chapter4exercises.SalesCommissionCalculator;

import java.util.Scanner;

public class SalesCommissionCalculatorMain {
    public static void main(String[] args) {
        SalesCommissionCalculator earnings = new SalesCommissionCalculator();

        Scanner input = new Scanner(System.in);

        int sentinel = 0;
        while (sentinel != -1) {
            System.out.println("Enter sale price: >>> ");
            earnings.sale(input.nextDouble());
            System.out.println("Enter -1 to end to 0 to enter another sale");
            sentinel = input.nextInt();
        }
        System.out.println("Weekly Salary: " + earnings.getWeekSalary());
    }
}
