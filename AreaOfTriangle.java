/* A program that prompts the user to enter the 3 points of a triangle and displays its area*/
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle:");

        //collecting inputs
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //finding side lengths
        double side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double side2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        //finding the semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        //finding the area of the triangle
        double areaOfTriangle;
        areaOfTriangle = Math.sqrt(s * (s-side1) * (s-side2) * (s - side3));

        System.out.print("The area of the triangle is " + areaOfTriangle);
    }
}
