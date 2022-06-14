package ClassTasks.Sms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseTest {
    Course course = new Course();

    @Test
    void courseObjectCanBeCreatedTest() {
        assertNotNull(course);
    }

    @Test
    void courseCanBeViewedTest() {
        course.setCourseName("Biology");
        assertTrue(course.viewCourseName().equals("Biology"));


    }

    @Test
    void courseCanBeSetTest() {
        course.setCourseName("Physics");
        assertTrue(course.viewCourseName().equals("Physics"));
    }


}