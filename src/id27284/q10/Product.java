package id27284.q10;


public class Product extends Category {
    private String productName;
    private String productCode;
    private double price;

    public Product(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        if (productName == null || productName.isEmpty()) throw new ShoppingDataException("productName required");
        if (productCode == null || productCode.isEmpty()) throw new ShoppingDataException("productCode required");
        if (price <= 0) throw new ShoppingDataException("price must be > 0");
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public String getProductCode() { return productCode; }
    public double getPrice() { return price; }
}
