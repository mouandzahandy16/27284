package id27284.q6;


    public class Customer extends Account {
        private String customerName;
        private String email;
        private String phoneNumber;

        public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                        String bankName, String branchCode, String address,
                        String accountNumber, String accountType, double balance,
                        String customerName, String email, String phoneNumber)
                throws BankingDataException {

            super(id, createdDate, updatedDate, bankName, branchCode, address,
                    accountNumber, accountType, balance);

            if (customerName == null || customerName.isEmpty())
                throw new BankingDataException("customerName required");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                throw new BankingDataException("invalid email");
            if (!phoneNumber.matches("\\d{10}"))
                throw new BankingDataException("phone must be 10 digits");

            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getCustomerName() { return customerName; }
    }


