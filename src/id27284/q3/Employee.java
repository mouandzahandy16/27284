package id27284.q3;


    public class Employee extends Manager {
        private String employeeName;
        private int employeeId;
        private String designation;
        private String contactNumber;

        public Employee(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                        String companyName, String address, String phoneNumber, String email,
                        String departmentName, String departmentCode,
                        String managerName, String managerEmail, String phone,
                        String employeeName, int employeeId, String designation, String contactNumber)
                throws PayrollDataException {

            super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode, managerName, managerEmail, phone);

            if (employeeName == null || employeeName.isEmpty())
                throw new PayrollDataException("employeeName required");
            if (employeeId <= 0) throw new PayrollDataException("employeeId must be > 0");
            if (designation == null || designation.isEmpty())
                throw new PayrollDataException("designation required");
            if (!contactNumber.matches("\\d{10}"))
                throw new PayrollDataException("contact must be 10 digits");

            this.employeeName = employeeName;
            this.employeeId = employeeId;
            this.designation = designation;
            this.contactNumber = contactNumber;
        }

        public String getEmployeeName() { return employeeName; }
        public int getEmployeeId() { return employeeId; }
    }


