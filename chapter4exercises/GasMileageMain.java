package chapter4exercises;

import java.util.Scanner;

public class GasMileageMain {
    private static int userInput;
    private static double milesPerGallon;

    public static void main(String[] args) {
        GasMileage trip = new GasMileage();

        Scanner input = new Scanner(System.in);

        int counter = 0;

        while (userInput != -1) {

            try {
                System.out.println("Enter mileage traveled for this trip");
                int mileage = input.nextInt();
                System.out.println("Enter gallons used this trip");
                int gallons = input.nextInt();
                if (mileage < 1 || gallons < 1) throw new Exception("Input must be greater than 1");
                trip.setGallons(gallons);
                trip.setMiles(mileage);

                milesPerGallon += trip.calculateMPG(trip.getMiles(), trip.getGallons());
                counter++;
                System.out.print("You obtained: " + milesPerGallon + " miles per gallon for " + counter + (counter > 1 ? " trips!\n" : " trip!\n"));

                System.out.println("Enter any integer to continue or -1 to end");
                userInput = input.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("You entered an invalid input!");
            }
        }
    }
}
