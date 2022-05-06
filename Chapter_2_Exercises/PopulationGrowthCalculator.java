/*
2.34 (World Population Growth Calculator) Search the Internet to determine the current world
population and the annual world population growth rate. Write an application that inputs these values,
then displays the estimated world population after one, two, three, four and five years.
 */
package Chapter_2_Exercises;

import java.util.Scanner;

public class PopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long currentWorldPopulation = 7_945_022_511L;
        double PopulationGrowthRate = .0108;

        System.out.printf("World population currently is at %d%n", currentWorldPopulation);
        System.out.printf("World population after one year will be at %.0f%n", currentWorldPopulation * Math.pow((1 + PopulationGrowthRate), 1));
        System.out.printf("World population after two years will be at %.0f%n", currentWorldPopulation * Math.pow((1 + PopulationGrowthRate), 2));
        System.out.printf("World population after three years will be at %.0f%n", currentWorldPopulation * Math.pow((1 + PopulationGrowthRate), 3));
        System.out.printf("World population after four years will be at %.0f%n", currentWorldPopulation * Math.pow((1 + PopulationGrowthRate), 4));
        System.out.printf("World population after five years will be at %.0f%n", currentWorldPopulation * Math.pow((1 + PopulationGrowthRate), 5));
    }
}
