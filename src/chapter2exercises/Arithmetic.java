package chapter2exercises;/* An application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference
 of the squares
 */

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter another number: ");
        int secondNumber = input.nextInt();

        int firstNumberSquared = firstNumber * firstNumber;
        int secondNumberSquare = secondNumber * secondNumber;
        int sumOfSquares = firstNumberSquared + secondNumberSquare;
        int differenceOfSquares = firstNumberSquared - secondNumberSquare;

        System.out.printf("First number squared is %d %n", firstNumberSquared);
        System.out.printf("Second number squared is %d %n", secondNumberSquare);
        System.out.printf("Sum of squares is %d%n", sumOfSquares);
        System.out.printf("Difference of the two squares is %d.", differenceOfSquares);
    }
}
