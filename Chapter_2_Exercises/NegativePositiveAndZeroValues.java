/*
2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and
prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.
 */
package Chapter_2_Exercises;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five (5) numbers, each separated by a space: ");

        int negativeNumberCounter = 0, positiveNumberCounter = 0, zeroCounter = 0;

        int firstDigit = input.nextInt(), secondDigit = input.nextInt(), thirdDigit = input.nextInt(),
                fourthDigit = input.nextInt(), fifthDigit = input.nextInt();

        if (firstDigit > 0) {
            positiveNumberCounter++;
        } else if (firstDigit == 0) {
            zeroCounter++;
        } else if (firstDigit < 0) {
            negativeNumberCounter++;
        }

        if (secondDigit > 0) {
            positiveNumberCounter++;
        } else if (secondDigit == 0) {
            zeroCounter++;
        } else if (secondDigit < 0) {
            negativeNumberCounter++;
        }

        if (thirdDigit > 0) {
            positiveNumberCounter++;
        } else if (thirdDigit == 0) {
            zeroCounter++;
        } else if (thirdDigit < 0) {
            negativeNumberCounter++;
        }

        if (fourthDigit > 0) {
            positiveNumberCounter++;
        } else if (fourthDigit == 0) {
            zeroCounter++;
        } else if (fourthDigit < 0) {
            negativeNumberCounter++;
        }

        if (fifthDigit > 0) {
            positiveNumberCounter++;
        } else if (fifthDigit == 0) {
            zeroCounter++;
        } else if (fifthDigit < 0) {
            negativeNumberCounter++;
        }

        if (positiveNumberCounter > 0) {
            System.out.printf("There are %d positive numbers.%n", positiveNumberCounter);
        } else {
            System.out.println("There are no positive numbers.");
        }
   if (negativeNumberCounter > 0) {
            System.out.printf("There are %d negative numbers.%n", negativeNumberCounter);
        } else {
            System.out.println("There are no negative numbers.");
        }
   if (zeroCounter > 0) {
            System.out.printf("There are %d zeros in the number entered.%n", zeroCounter);
        } else {
            System.out.println("There are no zero numbers.");
        }

    }
}
