package ClassTasks.Sms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course = new Course();

    @Test
    void courseObjectCanBeCreatedTest() {
        assertNotNull(course);
    }

    @Test
    void courseCanBeViewedTest() {
        course.setCourseName("Biology");
        assertEquals("Biology", course.viewCourseName());


    }

    @Test
    void courseCanBeSetTest() {
        course.setCourseName("Physics");
        assertEquals("Physics", course.viewCourseName());
    }


}