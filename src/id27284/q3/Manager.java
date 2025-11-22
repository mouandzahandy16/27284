package id27284.q3;


    public class Manager extends Department {
        private String managerName;
        private String managerEmail;
        private String phone;

        public Manager(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String companyName, String address, String phoneNumber, String email,
                       String departmentName, String departmentCode,
                       String managerName, String managerEmail, String phone)
                throws PayrollDataException {

            super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode);

            if (managerName == null || managerName.isEmpty())
                throw new PayrollDataException("managerName required");

            if (!managerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                throw new PayrollDataException("invalid managerEmail");

            if (!phone.matches("\\d{10}"))
                throw new PayrollDataException("phone must be 10 digits");

            this.managerName = managerName;
            this.managerEmail = managerEmail;
            this.phone = phone;
        }

        public String getManagerName() { return managerName; }
    }


