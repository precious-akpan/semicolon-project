/*
2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format.

 */
package Chapter_2_Exercises;

public class TableOfSquaresAndCubes {
    public static void main(String[] args) {
        int zero, one, two, three, four, five, six, seven, eight, nine, ten;

        System.out.println("Number Square Cube");
        System.out.printf("%d      %d      %d%n", 0, 0*0, 0*0*0);
        System.out.printf("%d      %d      %d%n", 1, 1*1, 1*1*1);
        System.out.printf("%d      %d      %d%n", 2, 2*2, 2*2*2);
        System.out.printf("%d      %d      %d%n", 3, 3*3, 3*3*3);
        System.out.printf("%d      %d     %d%n", 4, 4*4, 4*4*4);
        System.out.printf("%d      %d     %d%n", 5, 5*5, 5*5*5);
        System.out.printf("%d      %d     %d%n", 6, 6*6, 6*6*6);
        System.out.printf("%d      %d     %d%n", 7, 7*7, 7*7*7);
        System.out.printf("%d      %d     %d%n", 8, 8*8, 8*8*8);
        System.out.printf("%d      %d     %d%n", 9, 9*9, 9*9*9);
        System.out.printf("%d     %d    %d%n", 10, 10*10, 10*10*10);
    }
}
