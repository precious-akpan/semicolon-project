/*
3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
that your heart rate stays within a safe range suggested by your trainers and doctors. According to
the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating
your maximum heart rate in beats per minute is 220 minus your age in years. Your target
heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.]

Create a class called HeartRates.
The class attributes should include the person’s first name, last name and date of birth (consisting of
separate attributes for the month, day and year of birth). Your class should have a constructor that
receives this data as parameters. For each attribute provide set and get methods. The class also should
include a method
that calculates and returns the person’s age (in years), a method that calculates and returns the
person’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class Heart
Rates and prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target
heart-rate range
 */
package Chapter_3_Exercises.HeartRate;

import java.time.LocalDate;

public class HeartRate {
    public String dateOfBirth;
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    private final int currentYear = LocalDate.now().getYear();

    public HeartRate(String firstName, String lastName, int dayOfBirth, String monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getDateOfBirth() {
        setDateOfBirth();
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = getDayOfBirth() + " " + getMonthOfBirth() + ", " + getYearOfBirth();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int calculateAge() {
        return currentYear - yearOfBirth;
    }

    public int maximumHeartRate() {
        return 220 - calculateAge();
    }

    public int targetHeartRate() {
        return (int) (maximumHeartRate() * .85);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth > 0 && dayOfBirth <= 31) {
            if (getMonthOfBirth().equals("February") && dayOfBirth <= 28) {
                this.dayOfBirth = dayOfBirth;
                return;
            }
            this.dayOfBirth = dayOfBirth;
        }
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
