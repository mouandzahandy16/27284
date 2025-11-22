package id27284.q2;


    public class Student extends Teacher {
        private String studentName;
        private int rollNumber;
        private String grade;
        private String contactNumber;

        public Student(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String schoolName, String address, String phoneNumber, String email,
                       String departmentName, String departmentCode,
                       String teacherName, String subject, String teacherEmail, String phone,
                       String studentName, int rollNumber, String grade, String contactNumber)
                throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode, teacherName, subject, teacherEmail, phone);

            if (studentName == null || studentName.isEmpty()) throw new SchoolDataException("studentName required");
            if (rollNumber <= 0) throw new SchoolDataException("rollNumber must be > 0");
            if (grade == null || grade.isEmpty()) throw new SchoolDataException("grade required");
            if (!contactNumber.matches("\\d{10}")) throw new SchoolDataException("contact must be 10 digits");

            this.studentName = studentName;
            this.rollNumber = rollNumber;
            this.grade = grade;
            this.contactNumber = contactNumber;
        }

        public String getStudentName() { return studentName; }
        public int getRollNumber() { return rollNumber; }
        public String getGrade() { return grade; }
        public String getContactNumber() { return contactNumber; }
    }


