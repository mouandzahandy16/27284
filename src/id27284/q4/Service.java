package id27284.q4;


    public class Service extends Booking {
        private String serviceName;
        private double serviceCost;

        public Service(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String hotelName, String address, String phoneNumber, String email,
                       String roomNumber, String roomType, double pricePerNight,
                       String customerName, String customerEmail, String contactNumber,
                       java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                       String serviceName, double serviceCost) throws HotelDataException {
            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber,
                    bookingDate, checkInDate, checkOutDate);

            if (serviceName == null || serviceName.isEmpty()) throw new HotelDataException("serviceName required");
            if (serviceCost < 0) throw new HotelDataException("serviceCost must be >= 0");

            this.serviceName = serviceName;
            this.serviceCost = serviceCost;
        }

        public String getServiceName() { return serviceName; }
        public double getServiceCost() { return serviceCost; }
    }


