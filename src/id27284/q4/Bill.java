package id27284.q4;


    public class Bill extends Payment {
        private double roomCharge;
        private double serviceCharge;
        private double totalBill;

        public Bill(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber,
                    java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, java.time.LocalDate paymentDate,
                    double roomCharge, double serviceCharge) throws HotelDataException {

            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate);

            if (roomCharge < 0) throw new HotelDataException("roomCharge must be >= 0");
            if (serviceCharge < 0) throw new HotelDataException("serviceCharge must be >= 0");

            this.roomCharge = roomCharge;
            this.serviceCharge = serviceCharge;
            this.totalBill = 0;
        }

        public double getRoomCharge() { return roomCharge; }
        public double getServiceCharge() { return serviceCharge; }
        public double getTotalBill() { return totalBill; }
        public void setTotalBill(double totalBill) { this.totalBill = totalBill; }
    }


