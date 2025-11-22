package id27284.q4;


    public class Feedback extends Bill {
        private int rating; // 1 - 5
        private String comments;

        public Feedback(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                    roomCharge, serviceCharge);

            if (rating < 1 || rating > 5) throw new HotelDataException("rating must be between 1 and 5");
            if (comments == null) comments = "";

            this.rating = rating;
            this.comments = comments;
        }

        public int getRating() { return rating; }
        public String getComments() { return comments; }
    }


