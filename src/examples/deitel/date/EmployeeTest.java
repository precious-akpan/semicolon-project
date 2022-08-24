package examples.deitel.date;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(3, 17, 1988);
        Date hire = new Date(3, 18, 2022);
        Employee employee = new Employee("Precious", "Akpan", hire, birth);

        System.out.println(employee);
    }
}
