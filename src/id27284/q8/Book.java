package id27284.q8;


public class Book extends Shelf {
    private String isbn;
    private String title;
    private String author;

    public Book(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String libraryName, String address,
                String sectionName, String shelfCode,
                String isbn, String title, String author)
            throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, address, sectionName, shelfCode);

        if (isbn == null || isbn.isEmpty())
            throw new LibraryDataException("ISBN required");
        if (title == null || title.isEmpty())
            throw new LibraryDataException("title required");
        if (author == null || author.isEmpty())
            throw new LibraryDataException("author required");

        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
}
