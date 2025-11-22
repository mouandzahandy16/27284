package id27284.q8;

import java.time.temporal.ChronoUnit;

public final class LibraryRecord extends Fine {

    public LibraryRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                memberName, email, borrowDate, returnDate, dailyRate);
    }

    public double calculateOverdueFine() {
        long days = ChronoUnit.DAYS.between(getBorrowDate(), getReturnDate());
        return days * getDailyRate();
    }
}
