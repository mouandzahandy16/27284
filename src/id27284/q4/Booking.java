package id27284.q4;
import java.time.LocalDate;

    public class Booking extends Customer {
        private LocalDate bookingDate;
        private LocalDate checkInDate;
        private LocalDate checkOutDate;

        public Booking(int id, LocalDate createdDate, LocalDate updatedDate,
                       String hotelName, String address, String phoneNumber, String email,
                       String roomNumber, String roomType, double pricePerNight,
                       String customerName, String customerEmail, String contactNumber,
                       LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate) throws HotelDataException {
            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber);

            if (bookingDate == null || checkInDate == null || checkOutDate == null)
                throw new HotelDataException("bookingDate/checkInDate/checkOutDate cannot be null");

            if (!checkOutDate.isAfter(checkInDate))
                throw new HotelDataException("checkOutDate must be after checkInDate");

            this.bookingDate = bookingDate;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public java.time.LocalDate getBookingDate() { return bookingDate; }
        public java.time.LocalDate getCheckInDate() { return checkInDate; }
        public java.time.LocalDate getCheckOutDate() { return checkOutDate; }
    }


