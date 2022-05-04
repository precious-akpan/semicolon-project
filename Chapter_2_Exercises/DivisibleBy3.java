/*2.25 (Divisible by 3) Write an application that reads an integer and determines and prints
whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
it’s divided by 3 with a remainder of 0.]

 */
package Chapter_2_Exercises;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");

        int userInput = input.nextInt();

        if (userInput % 3 == 0) {
            System.out.printf("%d is divisible by 3!", userInput);
        } else {
            System.out.printf("%d is not divisible by 3!", userInput);
        }
    }
}
