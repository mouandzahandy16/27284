package id27284.q2;
import java.time.LocalDate;
import java.util.Scanner;

    public class MainQ2 {
        private static final String STUDENT_ID = "27284";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("=== SCHOOL MANAGEMENT SYSTEM (Q2) ===");

                System.out.print("Enter ID: ");
                int id = Integer.parseInt(sc.nextLine());
                LocalDate today = LocalDate.now();

                System.out.print("School name: ");
                String schoolName = sc.nextLine();
                System.out.print("School address: ");
                String address = sc.nextLine();
                System.out.print("School phone: ");
                String phone = sc.nextLine();
                System.out.print("School email: ");
                String email = sc.nextLine();

                System.out.print("Department name: ");
                String depName = sc.nextLine();
                System.out.print("Department code: ");
                String depCode = sc.nextLine();

                System.out.print("Teacher name: ");
                String teacherName = sc.nextLine();
                System.out.print("Teacher subject: ");
                String subject = sc.nextLine();
                System.out.print("Teacher email: ");
                String teacherEmail = sc.nextLine();
                System.out.print("Teacher phone: ");
                String teacherPhone = sc.nextLine();

                System.out.print("Student name: ");
                String studentName = sc.nextLine();
                System.out.print("Roll number: ");
                int roll = Integer.parseInt(sc.nextLine());
                System.out.print("Grade: ");
                String grade = sc.nextLine();
                System.out.print("Student contact: ");
                String studentContact = sc.nextLine();

                System.out.print("Course name: ");
                String courseName = sc.nextLine();
                System.out.print("Course code: ");
                String courseCode = sc.nextLine();
                System.out.print("Credit hours: ");
                int creditHours = Integer.parseInt(sc.nextLine());

                System.out.print("Exam name: ");
                String examName = sc.nextLine();
                System.out.print("Max marks: ");
                double maxMarks = Double.parseDouble(sc.nextLine());
                System.out.print("Exam date (YYYY-MM-DD): ");
                LocalDate examDate = LocalDate.parse(sc.nextLine());

                System.out.print("Obtained marks: ");
                double obtainedMarks = Double.parseDouble(sc.nextLine());
                System.out.print("Remarks: ");
                String remarks = sc.nextLine();

                System.out.print("Tuition fee: ");
                double tuitionFee = Double.parseDouble(sc.nextLine());
                System.out.print("Exam fee: ");
                double examFee = Double.parseDouble(sc.nextLine());

                StudentRecord record = new StudentRecord(
                        id, today, today,
                        schoolName, address, phone, email,
                        depName, depCode,
                        teacherName, subject, teacherEmail, teacherPhone,
                        studentName, roll, grade, studentContact,
                        courseName, courseCode, creditHours,
                        examName, maxMarks, examDate,
                        obtainedMarks, remarks,
                        tuitionFee, examFee
                );

                double average = record.calculateAverageMarks();
                double totalFee = tuitionFee + examFee;
                record.setTotalFee(totalFee);

                System.out.println("\n===== RESULT (with Student ID: " + STUDENT_ID + ") =====");
                System.out.println("School: " + record.getSchoolName() + " | " + STUDENT_ID);
                System.out.println("Department: " + record.getDepartmentName());
                System.out.println("Teacher: " + record.getTeacherName());
                System.out.println("Student: " + record.getStudentName() + " | Roll: " + record.getRollNumber());
                System.out.println("Course: " + record.getCourseName() + " (" + record.getCourseCode() + ")");
                System.out.println("Exam: " + record.getExamName() + " | Date: " + record.getExamDate());
                System.out.println("Marks: " + obtainedMarks + "/" + maxMarks + " | Average: " + average + "%");
                System.out.println("Total Fee: " + totalFee);

            } catch (Exception ex) {
                System.err.println("ERROR: " + ex.getMessage() + " | " + STUDENT_ID);
            }
        }
    }


