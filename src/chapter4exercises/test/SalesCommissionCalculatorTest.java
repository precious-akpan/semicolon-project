package chapter4exercises.test;

import chapter4exercises.SalesCommissionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionCalculatorTest {
    @Test
    public void calculatorCanBeCreatedTest() {
        SalesCommissionCalculator calculator = new SalesCommissionCalculator();
        assertNotNull(calculator);
    }


    @Test
    public void weeklySalesCanBeCalculatedTest() {
        SalesCommissionCalculator preshEarnings = new SalesCommissionCalculator();
        preshEarnings.sale(200.0);
        preshEarnings.sale(300);
        double weeklySales = preshEarnings.getWeeklySales();
        assertEquals(500, weeklySales);
    }

    @Test
    void priceCannotBeLessThanOneTest() {
        SalesCommissionCalculator earnings = new SalesCommissionCalculator();
        earnings.sale(1000);
        earnings.sale(-10);
        earnings.sale(0);
        assertEquals(1000, earnings.getWeeklySales());
    }

    @Test
    void weeklyCommissionCanCalculatedTest() {
        SalesCommissionCalculator preshEarnings = new SalesCommissionCalculator();
        preshEarnings.sale(200);
        preshEarnings.sale(200);
        assertEquals((36), preshEarnings.getWeeklyCommission());
    }

    @Test
    void weeklySalaryCanBeCalculatedTest() {
        SalesCommissionCalculator preshEarnings = new SalesCommissionCalculator();
        preshEarnings.sale(5000);
        System.out.println(preshEarnings.getWeekSalary());
        assertEquals(650, preshEarnings.getWeekSalary());
    }

}
