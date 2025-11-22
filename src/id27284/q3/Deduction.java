package id27284.q3;


    public class Deduction extends Allowance {
        private double taxDeduction;
        private double loanDeduction;

        public Deduction(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                         String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String managerPhone,
                         String employeeName, int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction)
                throws PayrollDataException {

            super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance);

            if (taxDeduction < 0 || loanDeduction < 0)
                throw new PayrollDataException("deductions must be >= 0");

            this.taxDeduction = taxDeduction;
            this.loanDeduction = loanDeduction;
        }

        public double getTaxDeduction() { return taxDeduction; }
        public double getLoanDeduction() { return loanDeduction; }
    }


