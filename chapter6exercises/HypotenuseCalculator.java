/*
6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two arguments
of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]
 */
package chapter6exercises;

public class HypotenuseCalculator {


    public static void main(String[] args) {

    }

    public static void displayResult(double side1, double side2) {

        System.out.printf("The triangle with the sides %.2f and %.2f has a hypotenuse of %.2f",
                side1,
                side2,
                calculate(side1, side2)
        );
        System.out.println();
        System.out.println();
    }

    public static double calculate(double side1, double side2) {
        return Math.sqrt((side1 * side1) + (side2 * side2));
//        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
