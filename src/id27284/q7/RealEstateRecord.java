package id27284.q7;


    public final class RealEstateRecord extends Commission {

        public RealEstateRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                                String agencyName, String location, String phoneNumber,
                                String agentName, String emailAgent, String licenseNumber,
                                String propertyCode, String propertyType, double price,
                                String sellerName, String sellerContact,
                                String buyerName, String buyerEmail,
                                java.time.LocalDate agreementDate, String terms,
                                double paymentAmount, java.time.LocalDate paymentDate,
                                double commissionRate) throws RealEstateDataException {

            super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                    agentName, emailAgent, licenseNumber, propertyCode, propertyType, price,
                    sellerName, sellerContact, buyerName, buyerEmail, agreementDate, terms,
                    paymentAmount, paymentDate, commissionRate);
        }

        /**
         * calculateCommission() = (price × commissionRate) / 100
         */
        public double calculateCommission() {
            double price = getPrice();
            double rate = getCommissionRate();
            double commission = (price * rate) / 100.0;
            setCommissionAmount(commission);
            return commission;
        }
    }


