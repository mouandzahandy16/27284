package id27284.q6;


    public class Account extends Bank {
        private String accountNumber;
        private String accountType;
        private double balance;

        public Account(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address);

            if (accountNumber == null || accountNumber.isEmpty())
                throw new BankingDataException("accountNumber required");
            if (accountType == null || accountType.isEmpty())
                throw new BankingDataException("accountType required");
            if (balance < 0)
                throw new BankingDataException("balance must be ≥ 0");

            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.balance = balance;
        }

        public String getAccountNumber() { return accountNumber; }
        public double getBalance() { return balance; }
    }

