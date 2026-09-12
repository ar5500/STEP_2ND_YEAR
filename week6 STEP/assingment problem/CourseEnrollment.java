public class CourseEnrollment {
    private String courseName;
    private int enrolledStudents;
    private static int totalEnrollmentsAcrossCourses = 0;

    public CourseEnrollment(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = 0;
    }

    public void enrollStudent() {
        this.enrolledStudents++;
        totalEnrollmentsAcrossCourses++;
    }

    public void printDetails() {
        System.out.println("Course: " + courseName + " | Enrolled: " + enrolledStudents);
    }

    public static int getTotalEnrollmentsAcrossCourses() {
        return totalEnrollmentsAcrossCourses;
    }

    public static void main(String[] args) {
        CourseEnrollment c1 = new CourseEnrollment("Java Programming");
        CourseEnrollment c2 = new CourseEnrollment("Web Development");

        c1.enrollStudent();
        c1.enrollStudent();
        c2.enrollStudent();

        c1.printDetails();
        c2.printDetails();

        System.out.println("Total System Enrollments: " + CourseEnrollment.getTotalEnrollmentsAcrossCourses());
    }
}