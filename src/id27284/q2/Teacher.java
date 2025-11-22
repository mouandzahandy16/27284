package id27284.q2;

    public class Teacher extends Department {
        private String teacherName;
        private String subject;
        private String teacherEmail;
        private String phone;

        public Teacher(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String schoolName, String address, String phoneNumber, String email,
                       String departmentName, String departmentCode,
                       String teacherName, String subject, String teacherEmail, String phone)
                throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                    departmentName, departmentCode);

            if (teacherName == null || teacherName.isEmpty()) throw new SchoolDataException("teacherName required");
            if (subject == null || subject.isEmpty()) throw new SchoolDataException("subject required");
            if (!teacherEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                throw new SchoolDataException("invalid teacherEmail");
            if (!phone.matches("\\d{10}")) throw new SchoolDataException("phone must be 10 digits");

            this.teacherName = teacherName;
            this.subject = subject;
            this.teacherEmail = teacherEmail;
            this.phone = phone;
        }

        public String getTeacherName() { return teacherName; }
        public String getSubject() { return subject; }
        public String getTeacherEmail() { return teacherEmail; }
        public String getPhone() { return phone; }
    }

