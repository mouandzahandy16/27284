package id27284.q7;


    public class Buyer extends Seller {
        private String buyerName;
        private String email;

        public Buyer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String emailAgent, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String sellerContact,
                     String buyerName, String email) throws RealEstateDataException {
            super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                    agentName, emailAgent, licenseNumber, propertyCode, propertyType, price,
                    sellerName, sellerContact);

            if (buyerName == null || buyerName.isEmpty()) throw new RealEstateDataException("buyerName required");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new RealEstateDataException("invalid buyer email");

            this.buyerName = buyerName;
            this.email = email;
        }

        public String getBuyerName() { return buyerName; }
        public String getBuyerEmail() { return email; }
    }


