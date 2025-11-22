package id27284.q9;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ9 {

    private static final String STUDENT_ID = "27284";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== STUDENT MGMT SYSTEM (Q9) ===");

            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            LocalDate now = LocalDate.now();

            System.out.print("School name: ");
            String schoolName = sc.nextLine();
            System.out.print("School location: ");
            String location = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Program: ");
            String program = sc.nextLine();

            System.out.print("Course code: ");
            String courseCode = sc.nextLine();
            System.out.print("Course title: ");
            String courseTitle = sc.nextLine();

            System.out.print("Student name: ");
            String studentName = sc.nextLine();
            System.out.print("Student email: ");
            String email = sc.nextLine();

            System.out.print("Enrollment date (YYYY-MM-DD): ");
            LocalDate enrollmentDate = LocalDate.parse(sc.nextLine());

            System.out.print("Attended classes: ");
            int attended = Integer.parseInt(sc.nextLine());
            System.out.print("Total classes: ");
            int total = Integer.parseInt(sc.nextLine());

            System.out.print("Assignment mark: ");
            double assignment = Double.parseDouble(sc.nextLine());
            System.out.print("Exam mark: ");
            double exam = Double.parseDouble(sc.nextLine());

            StudentRecord record = new StudentRecord(
                    id, now, now,
                    schoolName, location,
                    dept, program,
                    courseCode, courseTitle,
                    studentName, email,
                    enrollmentDate,
                    attended, total,
                    assignment, exam
            );

            double finalGrade = record.calculateFinalGrade();
            double attendance = record.getAttendancePercentage();

            System.out.println("\n=== RESULT (" + STUDENT_ID + ") ===");
            System.out.println("Student: " + studentName + " | " + email);
            System.out.println("Attendance: " + attendance + "%");
            System.out.println("Final Grade: " + finalGrade + " | " + STUDENT_ID);

        } catch (Exception ex) {
            System.err.println("ERROR: " + ex.getMessage() + " | " + STUDENT_ID);
        }

        sc.close();
    }
}
