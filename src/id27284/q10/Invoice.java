package id27284.q10;


public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String storeName, String addressStore, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderId, java.time.LocalDate orderDate,
                   String paymentMethod, String paymentStatus,
                   String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address, orderId, orderDate, paymentMethod, paymentStatus,
                shippingAddress, shippingCost);
        this.totalAmount = 0;
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
