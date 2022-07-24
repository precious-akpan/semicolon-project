package chapter4exercises.main;

import chapter4exercises.SalesCommissionCalculator;

import java.util.Scanner;

public class SalesCommissionCalculatorMain {
    public static void main(String[] args) {
        SalesCommissionCalculator earnings = new SalesCommissionCalculator();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of items to enter: >>>");
        int numberOfItems = input.nextInt();
        int counter = 1;
        while (counter <= numberOfItems) {
            System.out.printf("Enter item %d sale price: >>> ", counter);
            earnings.sale(input.nextDouble());

            counter++;
        }
        System.out.println("Weekly Salary: " + earnings.getWeekSalary());
    }
}
