package id27284.q7;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ7 {

    private static final String STUDENT_ID = "27284";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== REAL ESTATE MANAGEMENT SYSTEM (Q7) ===");

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Agency name: ");
            String agencyName = sc.nextLine();
            System.out.print("Agency location: ");
            String location = sc.nextLine();
            System.out.print("Agency phone (10 digits): ");
            String agencyPhone = sc.nextLine();

            System.out.print("Agent name: ");
            String agentName = sc.nextLine();
            System.out.print("Agent email: ");
            String agentEmail = sc.nextLine();
            System.out.print("Agent license number: ");
            String license = sc.nextLine();

            System.out.print("Property code: ");
            String propertyCode = sc.nextLine();
            System.out.print("Property type: ");
            String propertyType = sc.nextLine();
            System.out.print("Property price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Seller name: ");
            String sellerName = sc.nextLine();
            System.out.print("Seller contact: ");
            String sellerContact = sc.nextLine();

            System.out.print("Buyer name: ");
            String buyerName = sc.nextLine();
            System.out.print("Buyer email: ");
            String buyerEmail = sc.nextLine();

            System.out.print("Agreement date (YYYY-MM-DD): ");
            LocalDate agreementDate = LocalDate.parse(sc.nextLine());
            System.out.print("Agreement terms: ");
            String terms = sc.nextLine();

            System.out.print("Payment amount: ");
            double paymentAmount = Double.parseDouble(sc.nextLine());
            System.out.print("Payment date (YYYY-MM-DD): ");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());

            System.out.print("Commission rate (percentage): ");
            double commissionRate = Double.parseDouble(sc.nextLine());

            RealEstateRecord record = new RealEstateRecord(
                    id, today, today,
                    agencyName, location, agencyPhone,
                    agentName, agentEmail, license,
                    propertyCode, propertyType, price,
                    sellerName, sellerContact,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    commissionRate
            );

            double commission = record.calculateCommission();

            System.out.println("\n=== RESULT (Student ID: " + STUDENT_ID + ") ===");
            System.out.println("Agency: " + record.getAgencyName() + " | " + STUDENT_ID);
            System.out.println("Agent: " + record.getAgentName() + " | License: " + record.getLicenseNumber());
            System.out.println("Property: " + record.getPropertyCode() + " (" + record.getPropertyType() + ")");
            System.out.println("Seller: " + record.getSellerName());
            System.out.println("Buyer: " + record.getBuyerName() + " | Email: " + record.getBuyerEmail());
            System.out.println("Price: " + price);
            System.out.println("Payment: " + record.getPaymentAmount() + " on " + record.getPaymentDate());
            System.out.println("Commission Rate: " + commissionRate + "%");
            System.out.println("COMMISSION AMOUNT: " + commission + " | " + STUDENT_ID);

        } catch (RealEstateDataException ex) {
            System.err.println("Validation error: " + ex.getMessage() + " | " + STUDENT_ID);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage() + " | " + STUDENT_ID);
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
