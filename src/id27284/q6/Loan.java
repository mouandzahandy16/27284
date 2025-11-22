package id27284.q6;


    public class Loan extends Withdrawal {
        private double loanAmount;
        private double interestRate;
        private int duration;

        public Loan(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber,
                    String transactionId, String transactionType, double amount,
                    double depositAmount, java.time.LocalDate depositDate,
                    double withdrawalAmount, java.time.LocalDate withdrawalDate,
                    double loanAmount, double interestRate, int duration)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, amount,
                    depositAmount, depositDate,
                    withdrawalAmount, withdrawalDate);

            if (loanAmount <= 0 || interestRate <= 0 || duration <= 0)
                throw new BankingDataException("loan, rate & duration must be > 0");

            this.loanAmount = loanAmount;
            this.interestRate = interestRate;
            this.duration = duration;
        }

        public double getLoanAmount() { return loanAmount; }
        public double getInterestRate() { return interestRate; }
        public int getDuration() { return duration; }
    }


