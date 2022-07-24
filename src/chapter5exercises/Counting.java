package chapter5exercises;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j<5; j++)
                System.out.print("*");
            System.out.println("\n#####");
        }
    }
}
