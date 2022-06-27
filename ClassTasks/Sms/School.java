package ClassTasks.Sms;

import java.util.ArrayList;

public class School {

    public String schoolName;
    public int numberOfStudents;
    public ArrayList<String> students = new ArrayList<>();
    public ArrayList<String> courses = new ArrayList<>();
    private ArrayList<String> studentCourses = new ArrayList<>();
    private int numberOfStudentsPerCourse;
    private int numberOfCourses;
    private int studentId;


    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public School() {
        super();
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

    private void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudentsPerCourse() {
        return studentCourses.size();

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

      /*  ArrayList<String> p=new ArrayList<String>();//Creating arraylist
       *//* list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");*//*
        //Printing the arraylist object
        System.out.println(list);*/
    }

