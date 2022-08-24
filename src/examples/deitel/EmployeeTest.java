package examples.deitel;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Employee before instantiation: %d%n", Employee.getCount());

        Employee e1 = new Employee("Precious", "Akpan");
        Employee e2 = new Employee("Susan", "Baker");

        System.out.printf("%nEmployees after instantiation%n");
        System.out.printf("Via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("Via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("Via Employee.getCount(): %d%n", Employee.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmplyee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
}
