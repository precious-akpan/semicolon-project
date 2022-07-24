package chapter4exercises;

import java.util.Scanner;

public class PassFail {
    /* write an app that aks you for a score, if a user enters a score above 55 display pass, below 55 display fail.


    step 1: ask user for a score

    step 2: compare score with 55

    step 3: if score is greater than 55

    step 4: display pass

    step 5: if score less than 55, display fail */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passMark = 55;
        System.out.print("Please enter your score:");
        int userInput = input.nextInt();

        int maxMark = 100;
        if(userInput > passMark && userInput < maxMark) {
            System.out.printf("You passed, well done!! ;-)");
        } else {
            System.out.printf("You failed! Shame on you!! ;-(");
        }
    }
}
