package chapter6exercises;

public class MathMethods {
    public static void main(String[] args) {
        System.out.printf("Absolute value of 23.7 (Math.abs(23.7)) is: %.2f%n", Math.abs(23.7));
        System.out.printf("Absolute value of 23.7 (Math.abs(0.0)) is: %f%n", Math.abs(0.0));
        System.out.printf("Absolute value of 23.7 (Math.abs(-23.7)) is: %f%n", Math.abs(-23.7));
        System.out.printf("Ceiling value of (Math.ceil(9.2)) is : %f%n", Math.ceil(9.2));
        System.out.printf("Ceiling value of (Math.ceil(-9.8)) is : %f%n", Math.ceil(-9.8));
        System.out.printf("Trigonometric cosine of 0.0 is: %f%n", Math.cos(0));
        System.out.printf("Exponential of 1.0 is: %f%n", Math.exp(1.0));
        System.out.printf("Exponential of 2.0 is: %f%n", Math.exp(2.0));
        System.out.printf("Floor of 9.2 is: %f%n", Math.floor(9.2));
        System.out.printf("Natural logarithm of base E: %f%n", Math.E);

        System.out.printf("Larger value of x and y: %f%n", Math.max(2.3, 12.7));

        System.out.printf("Smaller value of 2.3 and 12.7: %f%n", Math.min(2.3, 12.7));

        System.out.printf("2.0 raised to the power 7.0: %f%n", Math.pow(2.0, 7.0));

        System.out.printf("Trigonometric sine of 0: %f%n", Math.sin(0.0));

        System.out.printf("Square root of 900: %f%n", Math.sqrt(900.0));

        System.out.printf("Trigonometric tangent of 0: %f%n", Math.tan(0.0));


    }


}
