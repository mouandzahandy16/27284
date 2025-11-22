package id27284.q8;


public class Fine extends ReturnBook {
    private double dailyRate;

    public Fine(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String libraryName, String address,
                String sectionName, String shelfCode,
                String isbn, String title, String author,
                String memberName, String email,
                java.time.LocalDate borrowDate,
                java.time.LocalDate returnDate,
                double dailyRate)
            throws LibraryDataException {

        super(id, createdDate, updatedDate, libraryName, address,
                sectionName, shelfCode, isbn, title, author,
                memberName, email, borrowDate, returnDate);

        if (dailyRate <= 0)
            throw new LibraryDataException("dailyRate must be > 0");

        this.dailyRate = dailyRate;
    }

    public double getDailyRate() { return dailyRate; }
}
