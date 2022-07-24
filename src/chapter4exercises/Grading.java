package chapter4exercises;

import java.util.Scanner;

public class Grading {
    /*
    prompt a user for a score
    if user enters a score greater than 90 but less than or equal to 100 display A
    if score is greater than or equal to 80 and less than 90 display B
    if score is greater than or equal to 70 and less than 80 display C
    if score is greater than or equal to 60 and less than 70 display D
    if score is less than 60 display fail

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a score between 0 and 100");
        int score = input.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if(score >= 70 && score < 80) {
            System.out.println("C");
        } else if(score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score < 60) {
            System.out.println("F");
        }

    }
}
