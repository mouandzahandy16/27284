package id27284.q4;
import java.time.temporal.ChronoUnit;

    public final class ReservationRecord extends Feedback {

        public ReservationRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                                 String hotelName, String address, String phoneNumber, String email,
                                 String roomNumber, String roomType, double pricePerNight,
                                 String customerName, String customerEmail, String contactNumber,
                                 java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                                 String serviceName, double serviceCost,
                                 String paymentMethod, java.time.LocalDate paymentDate,
                                 double roomCharge, double serviceCharge,
                                 int rating, String comments) throws HotelDataException {

            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge,
                    rating, comments);
        }

        /**
         * generateBill(): computes room charge as pricePerNight * nights,
         * where nights = days between checkIn and checkOut.
         * total = roomCharge + serviceCharge
         */
        public double generateBill() {
            java.time.LocalDate checkIn = getCheckInDate();
            java.time.LocalDate checkOut = getCheckOutDate();
            long nights = ChronoUnit.DAYS.between(checkIn, checkOut);
            if (nights <= 0) nights = 0; // defensive (should be validated earlier)
            double pricePerNight = getPricePerNight();
            double roomChargeComputed = pricePerNight * nights;
            double serviceCharge = getServiceCost();
            double total = roomChargeComputed + serviceCharge;
            setTotalBill(total);
            // update internal roomCharge and serviceCharge fields (if needed)
            // they are private in parent — we used constructor values; but setTotalBill is available for total.
            return total;
        }
    }


