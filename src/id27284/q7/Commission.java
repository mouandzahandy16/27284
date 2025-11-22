package id27284.q7;


public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;

    public Commission(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                paymentAmount, paymentDate);

        if (commissionRate < 0) throw new RealEstateDataException("commissionRate must be >= 0");

        this.commissionRate = commissionRate;
        this.commissionAmount = 0;
    }

    public double getCommissionRate() { return commissionRate; }
    public double getCommissionAmount() { return commissionAmount; }
    public void setCommissionAmount(double commissionAmount) { this.commissionAmount = commissionAmount; }
}
