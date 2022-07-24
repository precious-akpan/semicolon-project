/*
A program that does three things.
enter 1 to book a room
enter 2 to check out and return index
enter 3 check details of who's in the room
enter -1 to exit
 */
package ClassTasks;

import java.util.Scanner;
//checkIn()
public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String[] hotel = new String[10];

        //create menu

        //request entry from user

        //perform task according to entry

        //wrap code in a sentinel-controlled loop
        int userInput;
         do {
             System.out.println("""     
                    Hotel
                    1. To book a room
                    2. Checkout
                    2. Check details of who's checked in
                                    
                    enter -1 to exit.
                    """);
             userInput = input.nextInt();
            switch (userInput) {
                case 1: {
//                    checkIn();
                    System.out.println("You booked a room in our hotel");
                }
                break;
                case 2:{
                    System.out.println("You checked-out ");
                }
                    break;
                case 3:{
                    System.out.println("User has been booked in this room");
                }
                    break;
                case -1: break;
                default:
                    System.out.println("Enter a valid number or -1 to exit");
                    userInput = input.nextInt();
            }
        } while (userInput != -1);
    }
}
