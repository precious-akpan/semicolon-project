/*
Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
body mass index. Also, display the BMI categories and their values from the National Heart Lung
and Blood Institute
http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
so the user can evaluate his/her BMI.
[Note: In this chapter, you learned to use the int type to represent whole numbers. The BMI
calculations when done with int values will both produce whole-number results. In Chapter 3
you’ll learn to use the double type to represent numbers with decimal points. When the BMI calculations are performed with doubles, they’ll both produce numbers with decimal points—these
are called “floating-point” numbers.]

BMI Categories:
Underweight = <18.5
Normal weight = 18.5–24.9
Overweight = 25–29.9
Obesity = BMI of 30 or greater
 */

package Chapter_2_Exercises;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightInKilograms, heightInMeters;

        System.out.print("Enter your weight in kilogram: ");
        weightInKilograms = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        heightInMeters = input.nextDouble();

        double BMI = weightInKilograms /(heightInMeters * heightInMeters);

        System.out.printf("Your BMI is %.1f.%n", BMI);

        if(BMI < 19) {
            System.out.println("You are underweight");
        }

        if (BMI > 18 && BMI < 25) {
            System.out.println("Your weight is normal");
        }
        if (BMI > 24 && BMI < 30) {
            System.out.println("You are overweight!");
        }
        if (BMI > 30) {
            System.out.println("You are obese!");
        }
    }
}
