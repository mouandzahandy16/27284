package id27284.q2;

    public class School extends Entity {
        private String schoolName;
        private String address;
        private String phoneNumber;
        private String email;

        public School(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String address, String phoneNumber, String email)
                throws SchoolDataException {

            super(id, createdDate, updatedDate);

            if (schoolName == null || schoolName.isEmpty()) throw new SchoolDataException("schoolName required");
            if (address == null || address.isEmpty()) throw new SchoolDataException("address required");
            if (!phoneNumber.matches("\\d{10}")) throw new SchoolDataException("phone must be 10 digits");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new SchoolDataException("invalid email");

            this.schoolName = schoolName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getSchoolName() { return schoolName; }
        public String getAddress() { return address; }
        public String getPhoneNumber() { return phoneNumber; }
        public String getEmail() { return email; }
    }


