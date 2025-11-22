package id27284.q7;


    public class Seller extends Property {
        private String sellerName;
        private String contactNumber;

        public Seller(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String agencyName, String location, String phoneNumber,
                      String agentName, String email, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String contactNumber) throws RealEstateDataException {
            super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                    agentName, email, licenseNumber, propertyCode, propertyType, price);

            if (sellerName == null || sellerName.isEmpty()) throw new RealEstateDataException("sellerName required");
            if (contactNumber == null || contactNumber.isEmpty()) throw new RealEstateDataException("contactNumber required");

            this.sellerName = sellerName;
            this.contactNumber = contactNumber;
        }

        public String getSellerName() { return sellerName; }
        public String getSellerContact() { return contactNumber; }
    }


