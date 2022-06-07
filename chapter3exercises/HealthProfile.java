/*
In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes
should include the person’s first name, last name, gender, date of birth (consisting of separate
attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the person’s
first name, last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
the BMI values chart from Exercise 2.33.

 */
package chapter3exercises;

import chapter3exercises.heartRate.HeartRate;


public class HealthProfile extends HeartRate {
    public HealthProfile(String firstName, String lastName, int dayOfBirth, String monthOfBirth, int yearOfBirth, double height, double weight, String gender) {
        super(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
        this.height = this.height;
        this.weight = this.weight;
        this.gender= this.gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String gender;
    public String dateOfBirth;
    public double height;
    public double weight;

}
