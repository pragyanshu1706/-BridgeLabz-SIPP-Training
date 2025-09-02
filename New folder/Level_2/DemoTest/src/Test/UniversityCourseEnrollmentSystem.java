package Test;

// Graded interface
interface Graded {
    void assignGrade(String grade);
}

// Student class
class Student {
    protected String name;
    protected String studentId;
    protected double gpa;
    protected Course[] enrolledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = 0.0;
        this.enrolledCourses = new Course[10];
    }

    public void enrollCourse(Course course) {
        // Enroll in course logic
    }

    public void displayTranscript() {
        // Display transcript logic
    }
}

// Undergraduate class extends Student
class Undergraduate extends Student {
    public Undergraduate(String name, String studentId) {
        super(name, studentId);
    }
}

// Postgraduate class extends Student
class Postgraduate extends Student {
    public Postgraduate(String name, String studentId) {
        super(name, studentId);
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;
    private Graded graded;

    public Course(String courseId, String courseName, Graded graded) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.graded = graded;
    }

    public void assignGrade(String grade) {
        graded.assignGrade(grade);
    }
}

// LetterGrade class implements Graded
class LetterGrade implements Graded {
    private String grade;

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;
        // Calculate GPA based on grade
    }
}

// PassFailGrade class implements Graded
class PassFailGrade implements Graded {
    private String grade;

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;
        // Calculate GPA based on pass/fail
    }
}

// Faculty class
class Faculty {
    public void assignGrade(Course course, String grade) {
        course.assignGrade(grade);
    }
}

// Enrollment class
class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}

public class UniversityCourseEnrollmentSystem {
    public static void main(String[] args) {
        // Create students, courses, and faculty
        Student student = new Undergraduate("John Doe", "S12345");
        Course course = new Course("CSE101", "Introduction to Computer Science", new LetterGrade());
        Faculty faculty = new Faculty();

        // Enroll student in course
        student.enrollCourse(course);

        // Assign grade
        faculty.assignGrade(course, "A");

        // Display transcript
        student.displayTranscript();
    }
}
