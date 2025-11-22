package id27284.q6;
import java.time.LocalDate;

    public class Withdrawal extends Deposit {
        private double withdrawalAmount;
        private LocalDate withdrawalDate;

        public Withdrawal(int id, LocalDate createdDate, LocalDate updatedDate,
                          String bankName, String branchCode, String address,
                          String accountNumber, String accountType, double balance,
                          String customerName, String email, String phoneNumber,
                          String transactionId, String transactionType, double amount,
                          double depositAmount, LocalDate depositDate,
                          double withdrawalAmount, LocalDate withdrawalDate)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, amount,
                    depositAmount, depositDate);

            if (withdrawalAmount <= 0)
                throw new BankingDataException("withdrawalAmount must be > 0");
            if (withdrawalDate == null)
                throw new BankingDataException("withdrawalDate required");

            this.withdrawalAmount = withdrawalAmount;
            this.withdrawalDate = withdrawalDate;
        }
    }


