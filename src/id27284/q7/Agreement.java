package id27284.q7;
import java.time.LocalDate;

    public class Agreement extends Buyer {
        private LocalDate agreementDate;
        private String terms;

        public Agreement(int id, LocalDate createdDate, LocalDate updatedDate,
                         String agencyName, String location, String phoneNumber,
                         String agentName, String emailAgent, String licenseNumber,
                         String propertyCode, String propertyType, double price,
                         String sellerName, String sellerContact,
                         String buyerName, String buyerEmail,
                         LocalDate agreementDate, String terms) throws RealEstateDataException {
            super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                    agentName, emailAgent, licenseNumber, propertyCode, propertyType, price,
                    sellerName, sellerContact, buyerName, buyerEmail);

            if (agreementDate == null) throw new RealEstateDataException("agreementDate required");
            if (terms == null || terms.isEmpty()) throw new RealEstateDataException("terms required");

            this.agreementDate = agreementDate;
            this.terms = terms;
        }

        public java.time.LocalDate getAgreementDate() { return agreementDate; }
        public String getTerms() { return terms; }
    }

