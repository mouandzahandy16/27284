package id27284.q2;
import java.time.LocalDate;

    public class Exam extends Course {
        private String examName;
        private double maxMarks;
        private LocalDate examDate;

        public Exam(int id, LocalDate createdDate, LocalDate updatedDate,
                    String schoolName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String teacherName, String subject, String teacherEmail, String phone,
                    String studentName, int rollNumber, String grade, String contactNumber,
                    String courseName, String courseCode, int creditHours,
                    String examName, double maxMarks, LocalDate examDate)
                throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                    studentName, rollNumber, grade, contactNumber,
                    courseName, courseCode, creditHours);

            if (examName == null || examName.isEmpty()) throw new SchoolDataException("examName required");
            if (maxMarks <= 0) throw new SchoolDataException("maxMarks must be > 0");
            if (examDate == null) throw new SchoolDataException("examDate required");

            this.examName = examName;
            this.maxMarks = maxMarks;
            this.examDate = examDate;
        }

        public String getExamName() { return examName; }
        public double getMaxMarks() { return maxMarks; }
        public LocalDate getExamDate() { return examDate; }
    }


