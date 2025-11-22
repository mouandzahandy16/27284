package id27284.q10;


public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String storeName, String addressStore, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address,
                    String orderId, java.time.LocalDate orderDate,
                    String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email,
                categoryName, categoryCode, productName, productCode, price,
                customerName, contactNumber, address, orderId, orderDate, paymentMethod, paymentStatus);
        if (shippingAddress == null || shippingAddress.isEmpty()) throw new ShoppingDataException("shippingAddress required");
        if (shippingCost < 0) throw new ShoppingDataException("shippingCost must be >= 0");
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }

    public String getShippingAddress() { return shippingAddress; }
    public double getShippingCost() { return shippingCost; }
}
