package id27284.q4;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MainQ4 {

    private static final String STUDENT_ID = "27284";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== HOTEL RESERVATION SYSTEM (Q4) ===");

            System.out.print("Enter entity id (int >0): ");
            int id = Integer.parseInt(sc.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Hotel name: ");
            String hotelName = sc.nextLine();
            System.out.print("Hotel address: ");
            String address = sc.nextLine();
            System.out.print("Hotel phone (10 digits): ");
            String phone = sc.nextLine();
            System.out.print("Hotel email: ");
            String email = sc.nextLine();

            System.out.print("Room number: ");
            String roomNumber = sc.nextLine();
            System.out.print("Room type: ");
            String roomType = sc.nextLine();
            System.out.print("Price per night (double >0): ");
            double pricePerNight = Double.parseDouble(sc.nextLine());

            System.out.print("Customer name: ");
            String customerName = sc.nextLine();
            System.out.print("Customer email: ");
            String customerEmail = sc.nextLine();
            System.out.print("Customer contact (10 digits): ");
            String customerContact = sc.nextLine();

            System.out.print("Booking date (YYYY-MM-DD): ");
            LocalDate bookingDate = LocalDate.parse(sc.nextLine());
            System.out.print("Check-in date (YYYY-MM-DD): ");
            LocalDate checkInDate = LocalDate.parse(sc.nextLine());
            System.out.print("Check-out date (YYYY-MM-DD): ");
            LocalDate checkOutDate = LocalDate.parse(sc.nextLine());

            System.out.print("Service name (or 'None'): ");
            String serviceName = sc.nextLine();
            System.out.print("Service cost (>=0): ");
            double serviceCost = Double.parseDouble(sc.nextLine());

            System.out.print("Payment method: ");
            String paymentMethod = sc.nextLine();
            System.out.print("Payment date (YYYY-MM-DD): ");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());

            // initial roomCharge (we pass 0; generateBill will compute based on nights)
            double initialRoomCharge = 0.0;
            double initialServiceCharge = serviceCost;

            System.out.print("Feedback rating (1-5): ");
            int rating = Integer.parseInt(sc.nextLine());
            System.out.print("Feedback comments: ");
            String comments = sc.nextLine();

            ReservationRecord record = new ReservationRecord(
                    id, today, today,
                    hotelName, address, phone, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, customerContact,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    initialRoomCharge, initialServiceCharge,
                    rating, comments
            );

            double total = record.generateBill();

            System.out.println("\n===== RESULT (Student ID: " + STUDENT_ID + ") =====");
            System.out.println("Hotel: " + record.getHotelName() + " | " + STUDENT_ID);
            System.out.println("Room: " + record.getRoomNumber() + " (" + record.getRoomType() + ")");
            long nights = java.time.temporal.ChronoUnit.DAYS.between(record.getCheckInDate(), record.getCheckOutDate());
            System.out.println("Nights: " + nights + " | Price/Night: " + record.getPricePerNight());
            System.out.println("Service: " + record.getServiceName() + " | Service Cost: " + record.getServiceCost());
            System.out.println("Payment Method: " + record.getPaymentMethod() + " | Payment Date: " + record.getPaymentDate());
            System.out.println("Feedback: Rating " + record.getRating() + " | Comments: " + record.getComments());
            System.out.println("TOTAL BILL (room + service): " + total + " | " + STUDENT_ID);

        } catch (HotelDataException ex) {
            System.err.println("Validation error: " + ex.getMessage() + " | " + STUDENT_ID);
        } catch (DateTimeParseException ex) {
            System.err.println("Invalid date format. Use YYYY-MM-DD. | " + STUDENT_ID);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage() + " | " + STUDENT_ID);
            ex.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
