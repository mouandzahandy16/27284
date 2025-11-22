package id27284.q2;

    public class Department extends School {
        private String departmentName;
        private String departmentCode;

        public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                          String schoolName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode) throws SchoolDataException {

            super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);

            if (departmentName == null || departmentName.isEmpty())
                throw new SchoolDataException("departmentName required");

            if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[A-Za-z0-9]+"))
                throw new SchoolDataException("departmentCode must be >=3 chars alphanumeric");

            this.departmentName = departmentName;
            this.departmentCode = departmentCode;
        }

        public String getDepartmentName() { return departmentName; }
        public String getDepartmentCode() { return departmentCode; }
    }


