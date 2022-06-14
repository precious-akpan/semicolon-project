package ClassTasks.Sms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school = new School("semicolon");

    @Test
    void schoolCanBeCreatedTest() {

        assertEquals("semicolon", school.schoolName);

    }

    @Test
    void numberOfStudentsCanBeCheckedTest() {
        school.admitStudent("Precious Akpan");
        school.admitStudent("Nifemi Daniel");
        school.admitStudent("Nouah Akoni");
        school.admitStudent("Dorcas Seriki");
        assertEquals(4, school.getNumberOfStudents());
        System.out.println(school.students.get(3));
    }

    @Test
    void studentsCanBeAdmittedTest() {
        school.admitStudent("Precious Akpan");
        school.admitStudent("Nifemi Daniel");
        school.admitStudent("Nouah Akoni");
        school.admitStudent("Dorcas Seriki");
        assertTrue( school.students.contains("Precious Akpan"));
        System.out.println(school.students);
    }

    @Test
    void studentsCanBeExpelledTest(){
        school.admitStudent("Precious Akpan");
        school.admitStudent("Nifemi Daniel");
        school.admitStudent("Dorcas Seriki");
        school.expelStudent("Precious Akpan");
        assertEquals(2 ,school.getNumberOfStudents() );
        System.out.println(school.students.get(1));
//        for (String student:school.students
//             ) {
//            System.out.println(student);
//        }
    }
    @Test
    void testCoursesCanBeCreated(){
        school.createCourse("Physics");
        school.createCourse("Maths");
        school.createCourse("English");
        school.createCourse("Biology");
        assertTrue(school.courses.contains("Maths"));
    }
    @Test
    void testCoursesCanBeDeleted(){
        school.createCourse("Physics");
        school.createCourse("Maths");
        school.createCourse("English");
        school.createCourse("Biology");
        school.deleteCourse("Maths");
        assertFalse(school.courses.contains("Maths"));
    }


}
