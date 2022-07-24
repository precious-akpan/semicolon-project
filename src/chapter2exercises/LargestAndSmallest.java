/*
2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter.
 */
package chapter2exercises;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter five (5) integers each seperated by a space: ");

        int firstInt, secondInt, thirdInt, fourthInt, fifthInt, smallest, largest;
        firstInt = input.nextInt();
        secondInt = input.nextInt();
        thirdInt = input.nextInt();
        fourthInt = input.nextInt();
        fifthInt = input.nextInt();

        largest = firstInt;
        if (secondInt > largest) largest = secondInt;
        if (thirdInt > largest) largest = thirdInt;
        if (fourthInt > largest) largest = fourthInt;
        if (fifthInt > largest) largest = fifthInt;

        smallest = firstInt;
        if (secondInt < smallest) smallest = secondInt;
        if (thirdInt < smallest) smallest = thirdInt;
        if (fourthInt < smallest) smallest = fourthInt;
        if (fifthInt < smallest) smallest = fifthInt;

        System.out.printf("%d is the largest integer.%n", largest);
        System.out.printf("%d is the smallest integer.%n", smallest);
    }

}
