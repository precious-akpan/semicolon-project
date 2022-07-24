package ClassTasks;

import java.util.Scanner;

public class InteractiveResponse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("For English press 1");
        System.out.println("For Igbo press 2");
        System.out.println("For French press 3");
        System.out.println("For Yoruba press 4");

        int userInput = input.nextInt();

        switch (userInput) {
            case 1 -> {
                System.out.println("For sharing press 1");
                System.out.println("For caring press 2");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.print("Sharing is caring");
                    case 2 -> System.out.println("Caring is sharing");
                    default -> System.out.println("Please make a valid selection");
                }
            }
            case 2 -> {
                System.out.println("To learn Igbo press 1");
                System.out.println("To speak to another Igbo learner press 2");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("You will be assigned to a teacher shortly");
                    case 2 -> System.out.println("You have been assigned to a speaker");
                    default -> System.out.println("Please enter a valid selection");
                }

            }
            case 3 -> {
                System.out.println("For a french teacher press 1");
                System.out.println("For a french speaker press 2");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Assigned to a teacher");
                    case 2 -> System.out.println("Assigned to a speaker");
                    default -> System.out.println("end");
                }
            }
            case 4 -> {
                System.out.println("For Ewa press 1");
                System.out.println("For Ago-yin press 2");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Enjoy your Ewa");
                    case 2 -> System.out.println("Enjoy your Ago-yin");
                    default -> System.out.println("Please enter a valid selection");
                }

            }

            default -> System.out.print("Unexpected value: " + userInput + ". Please enter a valid selection");
        }
    }
}
