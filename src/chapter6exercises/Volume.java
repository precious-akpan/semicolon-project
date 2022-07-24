package chapter6exercises;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the radius: ");
        double radius = input.nextInt();

        System.out.printf("Volume: %f", sphereVolume(radius));
    }

    public static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
