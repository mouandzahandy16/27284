package id27284.q6;


    public class Transaction extends Customer {
        private String transactionId;
        private String transactionType;
        private double amount;

        public Transaction(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                           String bankName, String branchCode, String address,
                           String accountNumber, String accountType, double balance,
                           String customerName, String email, String phoneNumber,
                           String transactionId, String transactionType, double amount)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber);

            if (transactionId == null || transactionId.isEmpty())
                throw new BankingDataException("transactionId required");
            if (transactionType == null || transactionType.isEmpty())
                throw new BankingDataException("transactionType required");
            if (amount <= 0)
                throw new BankingDataException("amount must be > 0");

            this.transactionId = transactionId;
            this.transactionType = transactionType;
            this.amount = amount;
        }

        public double getAmount() { return amount; }
    }


