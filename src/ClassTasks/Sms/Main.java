package ClassTasks.Sms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        School school = new School("Kpakurumo Grammar School");
        Course courses = new Course();
        Student student = new Student();

        int userSelection;
        do {
        System.out.println("""
                Welcome to Kpakurumo Grammar School Management Dashboard 
                                
                1. Admit Students
                2. Expel student
                3. Get total number of students
                4. Create course
                5. View Course
                6. Delete course
                7. Get number of students per course
                                
                Enter 0 to logout
                >>> """);

        userSelection = input.nextInt();

        switch (userSelection) {
            case 0: {userSelection = 0;
            }
            break;
            case 1: {
                display("Enter student first name and last name: >>> ");
                String firstName = input.next();
                String lastName = input.nextLine();
                String studentName = firstName + lastName;
                school.admitStudent(studentName);
                System.out.println("Admission successful!");
            }
            break;
            case 2: {
                display("Enter student first name and last name to expel: >>> ");
                String firstName = input.next();
                String lastName = input.nextLine();
                String studentName = firstName + lastName;
//                display(school.students);
                school.expelStudent(studentName.toLowerCase());

//                display(school.students);
            }
            break;
            case 3: {
                System.out.printf("Total number of student: %s students %n", school.getNumberOfStudents());
            }
            break;
            case 4: {
                display("Enter new course name: >>> ");
                String courseName = input.next();
                school.createCourse(courseName);
//                display(school.courses);
            }
            break;
            case 5:{
                display("List of Courses");
                for (String course :school.courses
                     ) {
                    display(course);
                }
                    System.out.println();
            }
            break;
            case 6: {
                display("Enter name of course to delete: >>>");
                String courseName = input.next();
                school.deleteCourse(courseName);
                System.out.printf("%s has been successfully deleted!", courseName);
//                System.out.println(school.courses);
            }
            break;
            case 7: {
                display("Number of students in each courses are: ");
                System.out.println();
            }
            break;
            default: display("Please make a valid selection");
        }
        } while (userSelection != 0);
    }

    private static void display(ArrayList<String> arrayList) {
        System.out.println(arrayList);
    }

    private static void display(String message) {
        System.out.println(message);
    }
}
