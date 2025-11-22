package id27284.q8;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ8 {

    private static final String STUDENT_ID = "27284";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== LIBRARY SYSTEM (Q8) ===");

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Library name: ");
            String libraryName = sc.nextLine();
            System.out.print("Library address: ");
            String address = sc.nextLine();

            System.out.print("Section name: ");
            String sectionName = sc.nextLine();
            System.out.print("Shelf code: ");
            String shelfCode = sc.nextLine();

            System.out.print("ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("Book title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Member name: ");
            String memberName = sc.nextLine();
            System.out.print("Member email: ");
            String email = sc.nextLine();

            System.out.print("Borrow date (YYYY-MM-DD): ");
            LocalDate borrowDate = LocalDate.parse(sc.nextLine());
            System.out.print("Return date (YYYY-MM-DD): ");
            LocalDate returnDate = LocalDate.parse(sc.nextLine());

            System.out.print("Daily fine rate: ");
            double rate = Double.parseDouble(sc.nextLine());

            LibraryRecord record = new LibraryRecord(
                    id, today, today,
                    libraryName, address,
                    sectionName, shelfCode,
                    isbn, title, author,
                    memberName, email,
                    borrowDate, returnDate,
                    rate
            );

            double fine = record.calculateOverdueFine();

            System.out.println("\n=== RESULT (" + STUDENT_ID + ") ===");
            System.out.println("Book: " + title + " | " + isbn);
            System.out.println("Borrowed by: " + memberName);
            System.out.println("Overdue Fine: " + fine + " | " + STUDENT_ID);

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage() + " | " + STUDENT_ID);
        }

        sc.close();
    }
}
