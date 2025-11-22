package id27284.q6;
import java.time.LocalDate;
import java.util.Scanner;

    public class MainQ6 {

        private static final String STUDENT_ID = "27284";

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("=== BANKING SYSTEM (Q6) ===");

                System.out.print("Enter ID: ");
                int id = Integer.parseInt(sc.nextLine());
                LocalDate today = LocalDate.now();

                System.out.print("Bank name: ");
                String bankName = sc.nextLine();
                System.out.print("Branch code (>=3 chars): ");
                String branchCode = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("Account number: ");
                String accNumber = sc.nextLine();
                System.out.print("Account type: ");
                String accType = sc.nextLine();
                System.out.print("Balance: ");
                double balance = Double.parseDouble(sc.nextLine());

                System.out.print("Customer name: ");
                String customerName = sc.nextLine();
                System.out.print("Customer email: ");
                String email = sc.nextLine();
                System.out.print("Customer phone (10 digits): ");
                String phone = sc.nextLine();

                System.out.print("Transaction ID: ");
                String transactionId = sc.nextLine();
                System.out.print("Transaction type: ");
                String transactionType = sc.nextLine();
                System.out.print("Transaction amount: ");
                double amount = Double.parseDouble(sc.nextLine());

                System.out.print("Deposit amount: ");
                double depositAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Deposit date (YYYY-MM-DD): ");
                LocalDate depositDate = LocalDate.parse(sc.nextLine());

                System.out.print("Withdrawal amount: ");
                double withdrawalAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Withdrawal date (YYYY-MM-DD): ");
                LocalDate withdrawalDate = LocalDate.parse(sc.nextLine());

                System.out.print("Loan amount: ");
                double loanAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Interest rate (%): ");
                double interestRate = Double.parseDouble(sc.nextLine());
                System.out.print("Duration (years): ");
                int duration = Integer.parseInt(sc.nextLine());

                System.out.print("Payment amount: ");
                double paymentAmount = Double.parseDouble(sc.nextLine());
                System.out.print("Payment date (YYYY-MM-DD): ");
                LocalDate paymentDate = LocalDate.parse(sc.nextLine());

                AccountRecord record = new AccountRecord(
                        id, today, today,
                        bankName, branchCode, address,
                        accNumber, accType, balance,
                        customerName, email, phone,
                        transactionId, transactionType, amount,
                        depositAmount, depositDate,
                        withdrawalAmount, withdrawalDate,
                        loanAmount, interestRate, duration,
                        paymentAmount, paymentDate
                );

                double interest = record.calculateInterest();

                System.out.println("\n=== RESULT (" + STUDENT_ID + ") ===");
                System.out.println("Bank: " + bankName + " | " + STUDENT_ID);
                System.out.println("Customer: " + customerName);
                System.out.println("Loan: " + loanAmount + " at " + interestRate + "% for " + duration + " years");
                System.out.println("Calculated Interest: " + interest + " | " + STUDENT_ID);

            } catch (Exception ex) {
                System.err.println("ERROR: " + ex.getMessage() + " | " + STUDENT_ID);
            }

            sc.close();
        }
    }


