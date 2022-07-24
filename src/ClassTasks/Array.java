package ClassTasks;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 33, -6, -7};

        int smallest = myArray[0] /*Integer.MAX_VALUE*/, largest = myArray[0]/*Integer.MIN_VALUE*/;
        int total = 0;
        for (int j : myArray) {
            total += j;
            if (largest < j) largest = j;
            if (smallest > j) smallest = j;
        }

        System.out.println("Total is: " + total);
        System.out.println("Average is: " + total / myArray.length);
        System.out.println("Maximum is: " + largest);
        System.out.println("Minimum is: " + smallest);
    }
}
