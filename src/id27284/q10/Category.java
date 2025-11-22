package id27284.q10;


public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        if (categoryName == null || categoryName.isEmpty()) throw new ShoppingDataException("categoryName required");
        if (categoryCode == null || categoryCode.length() < 3) throw new ShoppingDataException("categoryCode must be >= 3 chars");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}

