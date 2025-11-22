package id27284.q10;


public final class OrderRecord extends Invoice {

    public OrderRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
    }

    public double calculateTotalAmount() {
        double price = getPrice();
        double shippingCost = getShippingCost();
        double total = price + shippingCost;
        setTotalAmount(total);
        return total;
    }
}
