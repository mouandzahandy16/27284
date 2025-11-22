package id27284.q1;

    public class Hospital extends Entity {
        private String hospitalName;
        private String address;
        private String phoneNumber;
        private String email;

        public Hospital(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                        String hospitalName, String address, String phoneNumber, String email) throws HospitalDataException {
            super(id, createdDate, updatedDate);
            if (hospitalName == null || hospitalName.isEmpty()) throw new HospitalDataException("hospitalName required");
            if (address == null || address.isEmpty()) throw new HospitalDataException("address required");
            if (!phoneNumber.matches("\\d{10}")) throw new HospitalDataException("phone must be 10 digits");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HospitalDataException("invalid email");
            this.hospitalName = hospitalName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getHospitalName() { return hospitalName; }
        public String getAddress() { return address; }
        public String getPhoneNumber() { return phoneNumber; }
        public String getEmail() { return email; }
    }



