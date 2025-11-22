package id27284.q2;


    public class Result extends Exam {
        private double obtainedMarks;
        private String remarks;

        public Result(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode,
                      String teacherName, String subject, String teacherEmail, String phone,
                      String studentName, int rollNumber, String grade, String contactNumber,
                      String courseName, String courseCode, int creditHours,
                      String examName, double maxMarks, java.time.LocalDate examDate,
                      double obtainedMarks, String remarks)
                throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                    studentName, rollNumber, grade, contactNumber,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate);

            if (obtainedMarks < 0) throw new SchoolDataException("obtainedMarks >= 0");
            if (remarks == null || remarks.isEmpty()) throw new SchoolDataException("remarks required");

            this.obtainedMarks = obtainedMarks;
            this.remarks = remarks;
        }

        public double getObtainedMarks() { return obtainedMarks; }
        public String getRemarks() { return remarks; }
    }


