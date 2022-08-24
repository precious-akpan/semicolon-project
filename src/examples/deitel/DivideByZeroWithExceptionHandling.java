package examples.deitel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {

//                quotient(input.nextInt(), input.nextInt() );
                System.out.print("Please enter an integer numerator>>>");
                int numerator = input.nextInt();
                System.out.print("Please enter an integer denominator>>>");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                input.nextLine();
                System.out.printf("You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);


    }

    public static int quotient(int numerator, int denominator) throws InputMismatchException, ArithmeticException {
        return numerator / denominator;
    }
}
