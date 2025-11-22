package id27284.q8;
import java.time.LocalDate;

    public class ReturnBook extends Borrow {
        private LocalDate returnDate;

        public ReturnBook(int id, LocalDate createdDate, LocalDate updatedDate,
                          String libraryName, String address,
                          String sectionName, String shelfCode,
                          String isbn, String title, String author,
                          String memberName, String email,
                          LocalDate borrowDate,
                          LocalDate returnDate)
                throws LibraryDataException {
            super(id, createdDate, updatedDate, libraryName, address,
                    sectionName, shelfCode, isbn, title, author,
                    memberName, email, borrowDate);

            if (returnDate == null)
                throw new LibraryDataException("returnDate required");

            this.returnDate = returnDate;
        }

        public LocalDate getReturnDate() { return returnDate; }
    }

