/*
A program that reads in investment amount, annual interest rate, and number of years
and displays the future investment value.
 */
import java.util.Scanner;

public class FinancialApplication  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount:");
        float investmentAmount = input.nextFloat();

        System.out.print("Enter annual interest rate in percentage:");
        float annualInterestRate = input.nextFloat();

        System.out.print("Enter number of years:");
        int numberOfYears = input.nextInt();
        int numberOfMonths = 12;
        int percent = 100;
        float monthlyInterestRate = annualInterestRate / numberOfMonths/ percent;
        //System.out.println(monthlyInterestRate);
        double futureInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate),(numberOfYears*12));

        System.out.printf("Accumulated value is $%f", futureInvestmentValue);
    }
}
