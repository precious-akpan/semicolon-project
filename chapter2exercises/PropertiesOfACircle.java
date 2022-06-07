/*
2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you
learned about integers and the type int. Java can also represent floating-point numbers that contain
decimal points, such as 3.14159. Write an application that inputs from the user the radius of a circle
as an integer and prints the circle’s diameter, circumference and area using the floating-point value
3.14159 for π. Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant Math.PI
for the value of π. This constant is more precise than the value 3.14159. Class Math
is defined in package java.lang. Classes in that package are imported automatically, so you do not
need to import class Math to use it.] Use the following formulas (r is the radius):

diameter = 2r
circumference = 2πr
area = πr2
Do not store the results of each calculation in a variable. Rather, specify each calculation as the
value that will be output in a System.out.printf statement. The values produced by the circumference and area
calculations are floating-point numbers.
Such values can be output with the format specifier %f in a System.out.printf statement.
 */
package chapter2exercises;

import java.util.Scanner;

public class PropertiesOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for your circle: ");
        int radius = input.nextInt();

        System.out.printf("The diameter of the circle is %d%n%n", radius * 2);
        System.out.printf("The circumference of the circle is %.2f%n%n", 2 * Math.PI * radius);
        System.out.printf("The area is %.2f", Math.PI * (radius * radius));
    }
}
