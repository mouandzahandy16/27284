package id27284.q6;

    public class Bank extends Entity {
        private String bankName;
        private String branchCode;
        private String address;

        public Bank(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String bankName, String branchCode, String address)
                throws BankingDataException {

            super(id, createdDate, updatedDate);

            if (bankName == null || bankName.isEmpty())
                throw new BankingDataException("bankName required");
            if (branchCode == null || branchCode.length() < 3)
                throw new BankingDataException("branchCode must be ≥ 3 chars");
            if (address == null || address.isEmpty())
                throw new BankingDataException("address required");

            this.bankName = bankName;
            this.branchCode = branchCode;
            this.address = address;
        }

        public String getBankName() { return bankName; }
    }


