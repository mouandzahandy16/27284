package id27284.q6;
import java.time.LocalDate;

    public class Payment extends Loan {
        private double paymentAmount;
        private LocalDate paymentDate;

        public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount,
                       double depositAmount, LocalDate depositDate,
                       double withdrawalAmount, LocalDate withdrawalDate,
                       double loanAmount, double interestRate, int duration,
                       double paymentAmount, LocalDate paymentDate)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, amount,
                    depositAmount, depositDate,
                    withdrawalAmount, withdrawalDate,
                    loanAmount, interestRate, duration);

            if (paymentAmount <= 0)
                throw new BankingDataException("paymentAmount must be > 0");
            if (paymentDate == null)
                throw new BankingDataException("paymentDate required");

            this.paymentAmount = paymentAmount;
            this.paymentDate = paymentDate;
        }
    }


