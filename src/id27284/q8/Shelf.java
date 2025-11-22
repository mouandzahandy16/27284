package id27284.q8;


public class Shelf extends Section {
    private String shelfCode;

    public Shelf(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String libraryName, String address,
                 String sectionName,
                 String shelfCode)
            throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, address, sectionName);

        if (shelfCode == null || shelfCode.isEmpty())
            throw new LibraryDataException("shelfCode required");

        this.shelfCode = shelfCode;
    }

    public String getShelfCode() { return shelfCode; }
}
