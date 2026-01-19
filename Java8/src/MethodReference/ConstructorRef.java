package MethodReference;

@FunctionalInterface
interface Interface{

    Course test (int a, String b, String c, String d);

}

class Course{
    private int courseId;
    private String courseName;
    private String duration;
    private String trainer;

    public Course() {
        System.out.println("Default constructor!!!");
    }

    public Course(int courseId, String courseName, String duration, String trainer) {
        System.out.println("4 Parameterized constructor!!!");
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.trainer = trainer;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }
}

public class ConstructorRef {
    public static void main(String[] args) {

        // IMPLEMENTATION USING LAMBDA EXP

        Interface i = (a,b,c,d) -> {
          Course course = new Course(a,b,c,d);
          return course;
        };

        Course courseDetails = i.test(101, "React", "5 months", "Coursera");
        System.out.println("Course 1 details using lamda exp are :: \n"+courseDetails);
        System.out.println("\n");

        //  IMPLEMENTATION USING CONSTRUCTOR REFERENCE

        Interface i2 = Course::new;
        Course course2Details = i2.test(102,"java","8 months","Percipio");
        System.out.println("Course 2 details using constructor ref are :: \n"+course2Details);
    }
}
