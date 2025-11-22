package id27284.q3;


    public class Salary extends Deduction {
        private double basicSalary;
        private double grossSalary;
        private double netSalary;

        public Salary(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode,
                      String managerName, String managerEmail, String managerPhone,
                      String employeeName, int employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays,
                      double housingAllowance, double transportAllowance,
                      double taxDeduction, double loanDeduction,
                      double basicSalary)
                throws PayrollDataException {

            super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction);

            if (basicSalary <= 0)
                throw new PayrollDataException("basicSalary must be > 0");

            this.basicSalary = basicSalary;
            this.grossSalary = 0;
            this.netSalary = 0;
        }

        public double getBasicSalary() { return basicSalary; }
        public double getGrossSalary() { return grossSalary; }
        public void setGrossSalary(double grossSalary) { this.grossSalary = grossSalary; }

        public double getNetSalary() { return netSalary; }
        public void setNetSalary(double netSalary) { this.netSalary = netSalary; }
    }


