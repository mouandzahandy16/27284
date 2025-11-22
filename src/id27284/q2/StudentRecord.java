package id27284.q2;

    public final class StudentRecord extends Fee {

        public StudentRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                             String schoolName, String address, String phoneNumber, String email,
                             String departmentName, String departmentCode,
                             String teacherName, String subject, String teacherEmail, String phone,
                             String studentName, int rollNumber, String grade, String contactNumber,
                             String courseName, String courseCode, int creditHours,
                             String examName, double maxMarks, java.time.LocalDate examDate,
                             double obtainedMarks, String remarks,
                             double tuitionFee, double examFee) throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                    studentName, rollNumber, grade, contactNumber,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtainedMarks, remarks,
                    tuitionFee, examFee);
        }

        public double calculateAverageMarks() {
            return (getObtainedMarks() / getMaxMarks()) * 100;
        }
    }


