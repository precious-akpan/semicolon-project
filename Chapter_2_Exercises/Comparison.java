/*
2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15.
 */

package Chapter_2_Exercises;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int userInput = input.nextInt();

        int comparisonValue = 100;
        int userInputSquared = (userInput * userInput);

        if (userInput > comparisonValue && userInputSquared > comparisonValue) {
            System.out.printf("%d and %d squared is greater than %d", userInput, userInput, comparisonValue );
        }

        if (userInput == comparisonValue && userInputSquared == comparisonValue) {
            System.out.printf("%d and %d squared is equal to %d", userInput, userInput, comparisonValue );
        }
        if (userInput != comparisonValue && userInputSquared != comparisonValue) {
            System.out.printf("%d and %d squared is not equal to %d", userInput, userInput, comparisonValue );
        }

        if (userInput < comparisonValue && userInputSquared < comparisonValue) {
            System.out.printf("%d and %d squared is less than %d", userInput, userInput, comparisonValue );
        }

        if (userInput > comparisonValue) {
            System.out.printf("%d is greater than %d%n", userInput, comparisonValue);
        }
        if (userInput == comparisonValue) {
            System.out.printf("%d is equal to %d%n", userInput, comparisonValue);

        }

        if (userInput != comparisonValue) {
            System.out.printf("%d is not equal to %d%n", userInput, comparisonValue);
        }

        if (userInput < comparisonValue) {
            System.out.printf("%d is less than %d%n", userInput, comparisonValue);
        }

        if (userInputSquared == comparisonValue) {
            System.out.printf("%d is equal to %d%n", userInputSquared, comparisonValue);
        }

        if (userInputSquared != comparisonValue) {
            System.out.printf("%d is not equal to %d%n", userInputSquared, comparisonValue);
        }

        if (userInputSquared < comparisonValue) {
            System.out.printf("%d is less than %d%n", userInputSquared, comparisonValue);
        }

        if (userInputSquared > comparisonValue) {
            System.out.printf("%d is greater than %d%n", userInputSquared, comparisonValue);
        }

        if (userInputSquared <= comparisonValue) {
            System.out.printf("%d is less than or equal to %d%n", userInputSquared, comparisonValue);
        }

        if (userInputSquared >= comparisonValue) {
            System.out.printf("%d is greater than or equal to %d%n", userInputSquared, comparisonValue);
        }
    }
}
