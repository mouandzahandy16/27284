package id27284.q6;
import java.time.LocalDate;

    public class Deposit extends Transaction {
        private double depositAmount;
        private LocalDate depositDate;

        public Deposit(int id, LocalDate createdDate, LocalDate updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount,
                       double depositAmount, LocalDate depositDate)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, amount);

            if (depositAmount <= 0)
                throw new BankingDataException("depositAmount must be > 0");
            if (depositDate == null)
                throw new BankingDataException("depositDate required");

            this.depositAmount = depositAmount;
            this.depositDate = depositDate;
        }
    }


