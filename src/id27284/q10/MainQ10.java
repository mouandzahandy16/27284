package id27284.q10;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ10 {

    private static final String STUDENT_ID = "27284";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== ONLINE SHOPPING SYSTEM (Q10) ===");

            System.out.print("Enter entity id (int >0): ");
            int id = Integer.parseInt(sc.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Store name: ");
            String storeName = sc.nextLine();
            System.out.print("Store address: ");
            String storeAddress = sc.nextLine();
            System.out.print("Store email: ");
            String storeEmail = sc.nextLine();

            System.out.print("Category name: ");
            String categoryName = sc.nextLine();
            System.out.print("Category code (>=3 chars): ");
            String categoryCode = sc.nextLine();

            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product code: ");
            String productCode = sc.nextLine();
            System.out.print("Product price (>0): ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Customer name: ");
            String customerName = sc.nextLine();
            System.out.print("Customer contact number: ");
            String customerContact = sc.nextLine();
            System.out.print("Customer address: ");
            String customerAddress = sc.nextLine();

            System.out.print("Order id: ");
            String orderId = sc.nextLine();
            System.out.print("Order date (YYYY-MM-DD): ");
            LocalDate orderDate = LocalDate.parse(sc.nextLine());

            System.out.print("Payment method: ");
            String paymentMethod = sc.nextLine();
            System.out.print("Payment status: ");
            String paymentStatus = sc.nextLine();

            System.out.print("Shipping address: ");
            String shippingAddress = sc.nextLine();
            System.out.print("Shipping cost (>=0): ");
            double shippingCost = Double.parseDouble(sc.nextLine());

            OrderRecord record = new OrderRecord(
                    id, today, today,
                    storeName, storeAddress, storeEmail,
                    categoryName, categoryCode,
                    productName, productCode, price,
                    customerName, customerContact, customerAddress,
                    orderId, orderDate,
                    paymentMethod, paymentStatus,
                    shippingAddress, shippingCost
            );

            double total = record.calculateTotalAmount();

            System.out.println("\n=== RESULT (Student ID: " + STUDENT_ID + ") ===");
            System.out.println("Store: " + record.getStoreName() + " | " + STUDENT_ID);
            System.out.println("Product: " + productName + " (" + productCode + ") | Price: " + price);
            System.out.println("Customer: " + customerName + " | Contact: " + customerContact);
            System.out.println("Order ID: " + orderId + " | Date: " + orderDate);
            System.out.println("Shipping: " + shippingAddress + " | Cost: " + shippingCost);
            System.out.println("TOTAL AMOUNT (price + shipping): " + total + " | " + STUDENT_ID);

        } catch (ShoppingDataException ex) {
            System.err.println("Validation error: " + ex.getMessage() + " | " + STUDENT_ID);
        } catch (Exception ex) {
            System.err.println("ERROR: " + ex.getMessage() + " | " + STUDENT_ID);
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
