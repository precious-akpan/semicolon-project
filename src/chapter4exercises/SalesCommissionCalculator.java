/*
4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the
number of items that can be sold.
Item Value
1    239.99
2    129.75
3    99.95
4    350.89
 */
package chapter4exercises;

public class SalesCommissionCalculator {

    private double weekSales;
    private double weeklyCommission;

    public void setWeeklyCommission() {
        double commission = .09;
        this.weeklyCommission = weekSales * commission;
    }

    public double getWeeklySales() {
        return weekSales;
    }

    public void sale(double price) {
        if (price < 1) System.out.println("Invalid input");
        else weekSales += price;
    }

    public double getWeeklyCommission() {
        setWeeklyCommission();
        return weeklyCommission;
    }

    public double getWeekSalary() {
        double weeklySalary = 200;
        return weeklySalary + getWeeklyCommission();
    }
}
