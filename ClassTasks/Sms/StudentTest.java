package ClassTasks.Sms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void setUp() {
        Student student = new Student();
    }

    @Test
    void studentNameCanBeSet() {
        student.setStudentName("Angela");
        assertEquals("Angela", student.getStudentName());
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
        assertEquals(4, student.courses.size());
        assertFalse(student.courses.isEmpty());

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
        assertTrue(student.courses.isEmpty());
    }
}