//A program that prompts the user to enter a weight in pounds and height in inches and displays the BMI
import java.util.Scanner;

public class CalculateBmi {
    public static void main (String... args) {
        Scanner input = new Scanner(System.in);

        //collecting inputs
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter your your height in inches: ");
        double heightInInches = input.nextDouble();

        //weight conversion
        double weightConversionRate = 0.45359237;
        double weightInKilogram = weightInPounds * weightConversionRate;

        //height conversion
        double heightConversionRate = 0.0254;
        double heightInMetres = heightInInches * heightConversionRate;

        double BMI = weightInKilogram / Math.pow(heightInMetres, 2);

        System.out.printf("Your BMI is %.4f", BMI);
    }
}
