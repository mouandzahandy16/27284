package id27284.q8;
import java.time.LocalDate;

    public class Borrow extends Member {
        private LocalDate borrowDate;

        public Borrow(int id, LocalDate createdDate, LocalDate updatedDate,
                      String libraryName, String address,
                      String sectionName, String shelfCode,
                      String isbn, String title, String author,
                      String memberName, String email,
                      LocalDate borrowDate)
                throws LibraryDataException {
            super(id, createdDate, updatedDate, libraryName, address,
                    sectionName, shelfCode, isbn, title, author,
                    memberName, email);

            if (borrowDate == null)
                throw new LibraryDataException("borrowDate required");

            this.borrowDate = borrowDate;
        }

        public LocalDate getBorrowDate() { return borrowDate; }
    }


