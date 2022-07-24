package chapter3exercises.heartRate.test;

import chapter3exercises.heartRate.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeartRateTest {
    private HeartRate trainee;

    @BeforeEach
    void setup() {
        trainee = new HeartRate("Precious", "Akpan", 17, "March", 1988);
    }

    @Test
    void getFirstName() {
        assertEquals("Precious", trainee.getFirstName());
    }

    @Test
    void calculateAge() {
        assertEquals(34, trainee.calculateAge());
    }

    @Test
    void maximumHeartRate() {
        System.out.println(trainee.maximumHeartRate());

    }

    @Test
    void targetHeartRate() {
        double targetHeartRate = trainee.targetHeartRate();
        assertEquals(158, targetHeartRate);
    }

    @Test
    void setFirstName() {
        trainee.setFirstName("Olamide");
        assertEquals("Olamide", trainee.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Akpan", trainee.getLastName());
    }

    @Test
    void setLastName() {
        trainee.setLastName("Victor");
        assertEquals("Victor", trainee.getLastName());
    }

    @Test
    void getDayOfBirth() {
        assertEquals(17, trainee.getDayOfBirth());
    }

    @Test
    void setDayOfBirthTest() {
        trainee.setDayOfBirth(28);
        assertEquals(28, trainee.getDayOfBirth());
    }

    @Test
    void setDayOfBirthGreaterThan31() {
        trainee.setDayOfBirth(50);
        assertEquals(17, trainee.getDayOfBirth());
    }

    @Test
    void setDayOfBirthNotGreaterThan28IfFebruary() {
        trainee.setMonthOfBirth("February");
        trainee.setDayOfBirth(12);
        assertEquals(12, trainee.getDayOfBirth());
    }

    @Test
    void setDayOfBirthNotLessThan0() {
        trainee.setMonthOfBirth("February");
        trainee.setDayOfBirth(0);
        assertEquals(17, trainee.getDayOfBirth());
    }

    @Test
    void getMonthOfBirth() {
        assertEquals("March", trainee.getMonthOfBirth());
    }

    @Test
    void setMonthOfBirth() {
        trainee.setMonthOfBirth("April");
        assertEquals("April", trainee.getMonthOfBirth());
    }

    @Test
    void getYearOfBirth() {
        assertEquals(1988, trainee.getYearOfBirth());
    }

    @Test
    void setYearOfBirth() {
        trainee.setYearOfBirth(1995);
        assertEquals(1995, trainee.getYearOfBirth());

    }

    @Test
    void getDateOfBirth() {
        trainee.setDateOfBirth();
        System.out.println(trainee.getDateOfBirth());
        assertEquals("17 March, 1988", trainee.getDateOfBirth());
    }
}