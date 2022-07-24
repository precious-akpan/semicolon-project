package ClassTasks.Sms;

public class Course {
    private String courseName;
    private String courseId;


    public Course() {
        super();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String viewCourseName() {
        return courseName;
    }
}
