package id27284.q4;
import java.time.LocalDate;

    public class Payment extends Service {
        private String paymentMethod; // e.g., Card, Cash
        private LocalDate paymentDate;

        public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                       String hotelName, String address, String phoneNumber, String email,
                       String roomNumber, String roomType, double pricePerNight,
                       String customerName, String customerEmail, String contactNumber,
                       LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                       String serviceName, double serviceCost,
                       String paymentMethod, LocalDate paymentDate) throws HotelDataException {
            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost);

            if (paymentMethod == null || paymentMethod.isEmpty()) throw new HotelDataException("paymentMethod required");
            if (paymentDate == null) throw new HotelDataException("paymentDate required");

            this.paymentMethod = paymentMethod;
            this.paymentDate = paymentDate;
        }

        public String getPaymentMethod() { return paymentMethod; }
        public LocalDate getPaymentDate() { return paymentDate; }
    }


