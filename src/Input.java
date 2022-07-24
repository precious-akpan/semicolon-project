/* an application that takes in two numbers and outputs the sum, difference, quotient and product of the two numbers*/
import java.util.Scanner;

public class Input {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNumber = input.nextInt();	
		System.out.println("Enter second number:");
		int secondNumber = input.nextInt();

		int sum = firstNumber + secondNumber;
		int diff = firstNumber - secondNumber;
		int quotient = firstNumber / secondNumber;
		int product = firstNumber * secondNumber;

		System.out.printf("Sum of the two numbers equals: %d%n", sum);
		System.out.printf("Difference of the two numbers equals: %d%n", diff);
		System.out.printf("Quotient of the two numbers equals: %d%n", quotient);
		System.out.printf("Product of the two numbers equals: %d%n", product);

	}

}


