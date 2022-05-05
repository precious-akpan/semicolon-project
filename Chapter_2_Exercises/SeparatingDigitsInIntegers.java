/*
2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting
of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
 4 2 3 3 9
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
need to use both division and remainder operations to “pick off” each digit.]
 */
package Chapter_2_Exercises;

import java.util.Scanner;

public class SeparatingDigitsInIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number made up of five (5) digits: ");
        int userInput = input.nextInt();

        int firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit;

        fifthDigit = userInput % 10;
        userInput /= 10;
        fourthDigit = userInput % 10;
        userInput /= 10;
        thirdDigit = userInput % 10;
        userInput /= 10;
        secondDigit = userInput % 10;
        userInput /= 10;
        firstDigit = userInput % 10;

        System.out.printf("%d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);

    }
}
