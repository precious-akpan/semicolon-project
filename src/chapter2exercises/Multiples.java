/*2.26 (Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.]
 */
package chapter2exercises;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two (2) integers, each seperated by a space: ");

        int firstInt = input.nextInt(), secondInt = input.nextInt();


        int firstIntTripled = firstInt * 3;
        int secondIntDoubled = secondInt * 2;

        if (secondIntDoubled % firstIntTripled == 0) {
            int result = secondIntDoubled / firstIntTripled;
            System.out.printf("%d divided by %d is %d", secondIntDoubled, firstIntTripled, result);
        }
        if (secondIntDoubled % firstIntTripled != 0){
            System.out.printf("The first number tripled is not a multiple of the second number doubled");
        }
    }
}
