package id27284.q1;

    public class Patient extends Nurse {
        private String patientName;
        private int age;
        private String gender;
        private String contactNumber;

        public Patient(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String hospitalName, String address, String phoneNumber, String email,
                       String departmentName, String departmentCode,
                       String doctorName, String specialization, String doctorEmail, String phone,
                       String nurseName, String shift, int yearsOfExperience,
                       String patientName, int age, String gender, String contactNumber) throws HospitalDataException {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                    departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                    nurseName, shift, yearsOfExperience);
            if (patientName == null || patientName.isEmpty()) throw new HospitalDataException("patientName required");
            if (age <= 0) throw new HospitalDataException("age must be > 0");
            if (!( "Male".equalsIgnoreCase(gender) || "Female".equalsIgnoreCase(gender) || "Other".equalsIgnoreCase(gender)))
                throw new HospitalDataException("gender must be Male/Female/Other");
            if (!contactNumber.matches("\\d{10}")) throw new HospitalDataException("contactNumber must be 10 digits");
            this.patientName = patientName;
            this.age = age;
            this.gender = gender;
            this.contactNumber = contactNumber;
        }

        public String getPatientName() { return patientName; }
        public int getAge() { return age; }
        public String getGender() { return gender; }
        public String getContactNumber() { return contactNumber; }
    }


