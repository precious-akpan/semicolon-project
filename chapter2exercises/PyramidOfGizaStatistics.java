/*
2.35 (Statistics for the Great Pyramid of Giza) The Great Pyramid of Giza is considered an engineering marvel
of its time.
Use the web to get statistics related to the Great Pyramid of Giza, and
find the estimated number of stones used to build it, the average weight of each stone,
and the number of years it took to build.
Create an application that calculates an estimate of how much, by
weight, of the pyramid was built each year, each hour, and each minute as it was being built. The
application should input the following information:
a) Estimated number of stones used.
b) Average weight of each stone.
c) Number of years taken to build the pyramid (assuming a year comprises 365 days).

The Great Pyramid was built by quarrying an estimated 2.3 million large blocks weighing
6 million tonnes in total.

How much did each block of the pyramids weigh?
How Heavy? More than 2,300,000 limestone and granite blocks were pushed, pulled,
and dragged into place on the Great Pyramid.
The average weight of a block is about 2.3 metric tons (2.5 tons).
 */

package chapter2exercises;

public class PyramidOfGizaStatistics {
    public static void main(String[] args) {

        double numberOfStones = 2_300_000;
        double averageWeightOfEachStoneInTons = 2.5;
        double yearsToBuild = 27;

        double sizeBuiltPerYear = numberOfStones / yearsToBuild * averageWeightOfEachStoneInTons;
        double sizeBuiltPerDay = sizeBuiltPerYear / 365;
        double sizeBuiltPerHour = sizeBuiltPerDay / 24;
        double sizeBuiltPerMinute = sizeBuiltPerHour / 60;

        System.out.printf("Size of pyramid built per year by weight is %.1f tons.%n", sizeBuiltPerYear);
        System.out.printf("Size of pyramid built per day by weight is %.1f tons.%n", sizeBuiltPerDay);
        System.out.printf("Size of pyramid built per hour by weight is %f tons.%n", sizeBuiltPerHour);
        System.out.printf("Size of pyramid built per minute by weight is %f tons.%n", sizeBuiltPerMinute);

    }
}
