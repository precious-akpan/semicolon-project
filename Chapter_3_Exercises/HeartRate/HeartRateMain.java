package Chapter_3_Exercises.HeartRate;

import java.util.Scanner;

public class HeartRateMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();

        System.out.print("Enter your month of birth: ");
        String monthOfBirth = input.next();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.println();

        HeartRate patient = new HeartRate(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);

        System.out.println("Patient Details:");
        System.out.printf("First Name: %s", patient.getFirstName());
        System.out.println();

        System.out.printf("Last Name: %s", patient.getLastName());
        System.out.println();

        System.out.printf("Date of birth: %s", patient.getDateOfBirth());
        System.out.println();

        System.out.printf("Age: %d years", patient.calculateAge());
        System.out.println();

        System.out.printf("Your heart rate should be between %d and %d", patient.targetHeartRate(), patient.maximumHeartRate());
    }
}
