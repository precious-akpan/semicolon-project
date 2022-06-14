package ClassTasks.Sms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student();

    @Test
    void studentNameCanBeSet() {
        student.setStudentName("Angela");
        assertTrue(student.getStudentName().equals("Angela"));
    }

    @Test
    void courseArrayListExits() {
        assertNotNull(student.courses);
    }

    @Test
    void coursesCanBeAddedToArrayListTest() {
        student.selectCourse("Maths");
        student.selectCourse("English");
        student.selectCourse("Biology");
        student.selectCourse("Science");
        assertFalse(student.courses.isEmpty());
        System.out.println(student.courses);

    }

    @Test
    void coursesCanBeRemovedTest() {
        student.selectCourse("Maths");
        student.selectCourse("English");
        student.selectCourse("Biology");
        student.selectCourse("Science");
        student.removeCourse("Maths");
        student.removeCourse("Science");
        System.out.println(student.courses);
        //assertTrue(student.courses.isEmpty());
    }
}