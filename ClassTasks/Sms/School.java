package ClassTasks.Sms;

import java.util.ArrayList;

public class School {

    public String schoolName;
    public int numberOfStudents;
    ArrayList<String> students = new ArrayList<>();

    private int numberOfStudentsPerCourse;
    private int numberOfCourses;

    ArrayList<String> courses = new ArrayList<>();
    private int studentId;


    public School(String schoolName) {
this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudentsPerCourse() {
        return numberOfStudentsPerCourse;
    }

    public void setNumberOfStudentsPerCourse(int numberOfStudentsPerCourse) {
        this.numberOfStudentsPerCourse = numberOfStudentsPerCourse;
    }

    public int getNumberOfCourses() {
        return courses.size();
    }

    public void setNumberOfCourses() {
        this.numberOfCourses = courses.size();
    }

    public void admitStudent(int admission) {
        numberOfStudents += admission;
    }

    public void expelStudent(String studentName) {
        students.remove(studentName);
//        getNumberOfStudents();
    }

    public void createCourse(String courseName) {
       courses.add(courseName);
    }

    public void deleteCourse(String courseName) {
        courses.remove(courseName);
    }

    public void admitStudent(String studentName) {
        students.add(studentId++, studentName);
    }
}
