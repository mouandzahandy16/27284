package id27284.q7;


import java.time.LocalDate;

public class Payment extends Agreement {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String emailAgent, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String sellerContact,
                   String buyerName, String buyerEmail,
                   LocalDate agreementDate, String terms,
                   double paymentAmount, LocalDate paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, emailAgent, licenseNumber, propertyCode, propertyType, price,
                sellerName, sellerContact, buyerName, buyerEmail, agreementDate, terms);

        if (paymentAmount <= 0) throw new RealEstateDataException("paymentAmount must be > 0");
        if (paymentDate == null) throw new RealEstateDataException("paymentDate required");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public java.time.LocalDate getPaymentDate() { return paymentDate; }
}

