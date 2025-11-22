package id27284.q3;


    public class Attendance extends Employee {
        private int totalDays;
        private int presentDays;
        private int leaveDays;

        public Attendance(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                          String companyName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode,
                          String managerName, String managerEmail, String managerPhone,
                          String employeeName, int employeeId, String designation, String contactNumber,
                          int totalDays, int presentDays, int leaveDays)
                throws PayrollDataException {

            super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber);

            if (totalDays < 0 || presentDays < 0 || leaveDays < 0)
                throw new PayrollDataException("attendance values must be >= 0");

            if (presentDays > totalDays)
                throw new PayrollDataException("presentDays cannot exceed totalDays");

            this.totalDays = totalDays;
            this.presentDays = presentDays;
            this.leaveDays = leaveDays;
        }

        public int getTotalDays() { return totalDays; }
    }


