package id27284.q8;


public class Library extends Entity {
    private String libraryName;
    private String address;

    public Library(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String libraryName, String address)
            throws LibraryDataException {
        super(id, createdDate, updatedDate);

        if (libraryName == null || libraryName.isEmpty())
            throw new LibraryDataException("libraryName required");
        if (address == null || address.isEmpty())
            throw new LibraryDataException("address required");

        this.libraryName = libraryName;
        this.address = address;
    }

    public String getLibraryName() { return libraryName; }
}
