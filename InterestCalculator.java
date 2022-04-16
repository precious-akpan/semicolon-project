/* A program to calculate monthly interest
 */

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate:");
        float[] numbers = {input.nextFloat(), input.nextFloat()};

        float interest = numbers[0] * (numbers[1]/1200);

        System.out.printf("The interest is %f", interest);

    }
}
