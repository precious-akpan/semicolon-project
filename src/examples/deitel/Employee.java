package examples.deitel;

public class Employee {
    private static int count;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;

        System.out.printf("Employee constructor: %s %s: count = %d%n", firstName, lastName, count);
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
