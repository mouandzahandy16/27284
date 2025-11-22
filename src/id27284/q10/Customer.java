package id27284.q10;


public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String address;

    public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String storeName, String addressStore, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price);
        if (customerName == null || customerName.isEmpty()) throw new ShoppingDataException("customerName required");
        if (contactNumber == null || contactNumber.isEmpty()) throw new ShoppingDataException("contactNumber required");
        if (address == null || address.isEmpty()) throw new ShoppingDataException("address required");
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
}
