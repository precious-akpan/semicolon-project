/*
2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
 */
package chapter2exercises;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers each seperated by a space: ");

        int firstInteger = input.nextInt();
        int secondInteger = input.nextInt();
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int product = firstInteger * secondInteger * thirdInteger;
        int average = (firstInteger + secondInteger + thirdInteger) / 3;


        /*      I would rather use this technique
            int smallest = Math.min(Math.min(firstInteger, secondInteger), thirdInteger);
            int largest = Math.max(Math.max(firstInteger, secondInteger), thirdInteger);

            largest = first
        */



        int smallest, largest;

        largest = firstInteger;
        if (secondInteger > largest) largest = secondInteger;
        if (thirdInteger > largest) largest = thirdInteger;

        smallest = firstInteger;
        if (secondInteger < smallest) smallest = secondInteger;
        if (thirdInteger < smallest) smallest = thirdInteger;

//        displays the sum, average, product, smallest and largest of the numbers.
        System.out.printf("%d is the sum of all the integers.%n", sum);
        System.out.printf("%d is the product of all the integers.%n", product);
        System.out.printf("%d is the average of all the integers.%n", average);
        System.out.printf("%d is the smallest of all the integers.%n", smallest);
        System.out.printf("%d is the largest of all the integers.", largest);
    }
}
