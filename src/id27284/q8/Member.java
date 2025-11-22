package id27284.q8;


public class Member extends Book {
    private String memberName;
    private String email;

    public Member(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String libraryName, String address,
                  String sectionName, String shelfCode,
                  String isbn, String title, String author,
                  String memberName, String email)
            throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, address, sectionName, shelfCode,
                isbn, title, author);

        if (memberName == null || memberName.isEmpty())
            throw new LibraryDataException("memberName required");

        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new LibraryDataException("Invalid email format");

        this.memberName = memberName;
        this.email = email;
    }
}
