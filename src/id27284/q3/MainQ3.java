package id27284.q3;
import java.time.LocalDate;
import java.util.Scanner;

    public class MainQ3 {

        private static final String STUDENT_ID = "27284";

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("=== EMPLOYEE PAYROLL SYSTEM (Q3) ===");

                System.out.print("Enter ID: ");
                int id = Integer.parseInt(sc.nextLine());
                LocalDate today = LocalDate.now();

                System.out.print("Company name: ");
                String companyName = sc.nextLine();
                System.out.print("Company address: ");
                String address = sc.nextLine();
                System.out.print("Company phone (10 digits): ");
                String companyPhone = sc.nextLine();
                System.out.print("Company email: ");
                String companyEmail = sc.nextLine();

                System.out.print("Department name: ");
                String depName = sc.nextLine();
                System.out.print("Department code: ");
                String depCode = sc.nextLine();

                System.out.print("Manager name: ");
                String managerName = sc.nextLine();
                System.out.print("Manager email: ");
                String managerEmail = sc.nextLine();
                System.out.print("Manager phone (10 digits): ");
                String managerPhone = sc.nextLine();

                System.out.print("Employee name: ");
                String empName = sc.nextLine();
                System.out.print("Employee ID: ");
                int empId = Integer.parseInt(sc.nextLine());
                System.out.print("Designation: ");
                String designation = sc.nextLine();
                System.out.print("Employee contact (10 digits): ");
                String empContact = sc.nextLine();

                System.out.print("Total days: ");
                int totalDays = Integer.parseInt(sc.nextLine());
                System.out.print("Present days: ");
                int presentDays = Integer.parseInt(sc.nextLine());
                System.out.print("Leave days: ");
                int leaveDays = Integer.parseInt(sc.nextLine());

                System.out.print("Housing allowance: ");
                double housing = Double.parseDouble(sc.nextLine());
                System.out.print("Transport allowance: ");
                double transport = Double.parseDouble(sc.nextLine());

                System.out.print("Tax deduction: ");
                double tax = Double.parseDouble(sc.nextLine());
                System.out.print("Loan deduction: ");
                double loan = Double.parseDouble(sc.nextLine());

                System.out.print("Basic salary: ");
                double basicSalary = Double.parseDouble(sc.nextLine());

                PayrollRecord record = new PayrollRecord(
                        id, today, today,
                        companyName, address, companyPhone, companyEmail,
                        depName, depCode,
                        managerName, managerEmail, managerPhone,
                        empName, empId, designation, empContact,
                        totalDays, presentDays, leaveDays,
                        housing, transport,
                        tax, loan,
                        basicSalary
                );

                double netSalary = record.calculateNetSalary();

                System.out.println("\n===== RESULT (ID: " + STUDENT_ID + ") =====");
                System.out.println("Company: " + companyName + " | " + STUDENT_ID);
                System.out.println("Department: " + depName);
                System.out.println("Manager: " + managerName);
                System.out.println("Employee: " + empName + " (" + empId + ")");
                System.out.println("Basic Salary: " + basicSalary);
                System.out.println("Allowances: " + (housing + transport));
                System.out.println("Deductions: " + (tax + loan));
                System.out.println("Gross Salary: " + record.getGrossSalary());
                System.out.println("NET SALARY: " + netSalary + " | " + STUDENT_ID);

            } catch (Exception ex) {
                System.err.println("ERROR: " + ex.getMessage() + " | " + STUDENT_ID);
            }
        }
    }


