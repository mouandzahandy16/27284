package id27284.q1;

    public class Department extends Hospital {
        private String departmentName;
        private String departmentCode;

        public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                          String hospitalName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode) throws HospitalDataException {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
            if (departmentName == null || departmentName.isEmpty()) throw new HospitalDataException("departmentName required");
            if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[A-Za-z0-9]+"))
                throw new HospitalDataException("departmentCode invalid");
            this.departmentName = departmentName;
            this.departmentCode = departmentCode;
        }

        public String getDepartmentName() { return departmentName; }
        public String getDepartmentCode() { return departmentCode; }
    }


