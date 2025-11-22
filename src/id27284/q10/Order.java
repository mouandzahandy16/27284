package id27284.q10;
import java.time.LocalDate;

public class Order extends Customer {
    private String orderId;
    private LocalDate orderDate;

    public Order(int id, LocalDate createdDate, LocalDate updatedDate,
                 String storeName, String addressStore, String email,
                 String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String address,
                 String orderId, LocalDate orderDate) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address);
        if (orderId == null || orderId.isEmpty()) throw new ShoppingDataException("orderId required");
        if (orderDate == null) throw new ShoppingDataException("orderDate required");
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public LocalDate getOrderDate() { return orderDate; }
}
