/*5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.

 */

package chapter5exercises;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values do you want to input: >>>");
        int numberOfValues = input.nextInt();

        int counter = 1;
        int min = 1_000_000_000;
        int max = 0;

        while (counter <= numberOfValues) {
            System.out.print("Enter number " + counter + ": >>> ");
            int userInput = input.nextInt();

            if (userInput < min) {
                min = userInput;
            }

            if (userInput > max) {
                max = userInput;
            }
            counter++;
        }
        System.out.println("The highest number is: " + max);
        System.out.println("The lowest number is: " + min);
        System.out.println("Sum of highest and lowest: " + (max + min));
    }
}
