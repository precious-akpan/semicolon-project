package ClassTasks.Sms;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentId;

    ArrayList<String> courses = new ArrayList<String>();


    public Student() {
        super();
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void selectCourse(String courseName) {
        courses.add(courseName);
    }

    public void removeCourse(String courseName) {
        courses.remove(courseName);
    }
}
