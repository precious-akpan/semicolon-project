// A program that calculates the cost of driving.
import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter driving distance:");
        float distance = input.nextFloat();

        System.out.print("Enter miles per gallon:");
        float milesPerGallon = input.nextFloat();

        System.out.print("Enter price per gallon:");
        float pricePerGallon = input.nextFloat();

        float costOfDriving = distance /  milesPerGallon * pricePerGallon;

        System.out.printf("The cost of driving is $%f", costOfDriving);


    }
}
