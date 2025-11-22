package id27284.q3;


    public class Company extends Entity {
        private String companyName;
        private String address;
        private String phoneNumber;
        private String email;

        public Company(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String companyName, String address, String phoneNumber, String email)
                throws PayrollDataException {

            super(id, createdDate, updatedDate);

            if (companyName == null || companyName.isEmpty())
                throw new PayrollDataException("companyName required");
            if (address == null || address.isEmpty())
                throw new PayrollDataException("address required");
            if (!phoneNumber.matches("\\d{10}"))
                throw new PayrollDataException("phone must be 10 digits");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                throw new PayrollDataException("invalid email");

            this.companyName = companyName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getCompanyName() { return companyName; }
        public String getAddress() { return address; }
    }


