package id27284.q2;

    public class Course extends Student {
        private String courseName;
        private String courseCode;
        private int creditHours;

        public Course(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode,
                      String teacherName, String subject, String teacherEmail, String phone,
                      String studentName, int rollNumber, String grade, String contactNumber,
                      String courseName, String courseCode, int creditHours)
                throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                    studentName, rollNumber, grade, contactNumber);

            if (courseName == null || courseName.isEmpty()) throw new SchoolDataException("courseName required");
            if (courseCode == null || courseCode.length() < 3) throw new SchoolDataException("courseCode must be >=3 chars");
            if (creditHours <= 0) throw new SchoolDataException("creditHours must be > 0");

            this.courseName = courseName;
            this.courseCode = courseCode;
            this.creditHours = creditHours;
        }

        public String getCourseName() { return courseName; }
        public String getCourseCode() { return courseCode; }
        public int getCreditHours() { return creditHours; }
    }


