package id27284.q10;
import java.time.LocalDate;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String storeName, String addressStore, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderId, LocalDate orderDate,
                   String paymentMethod, String paymentStatus) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address, orderId, orderDate);
        if (paymentMethod == null || paymentMethod.isEmpty()) throw new ShoppingDataException("paymentMethod required");
        if (paymentStatus == null || paymentStatus.isEmpty()) throw new ShoppingDataException("paymentStatus required");
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentStatus() { return paymentStatus; }
}
