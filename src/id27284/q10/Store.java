package id27284.q10;


public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String storeName, String address, String email) throws ShoppingDataException {
        super(id, createdDate, updatedDate);
        if (storeName == null || storeName.isEmpty()) throw new ShoppingDataException("storeName required");
        if (address == null || address.isEmpty()) throw new ShoppingDataException("address required");
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new ShoppingDataException("invalid email");
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }

    public String getStoreName() { return storeName; }
}
