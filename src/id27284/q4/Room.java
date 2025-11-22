package id27284.q4;


    public class Room extends Hotel {
        private String roomNumber;
        private String roomType; // e.g., Single, Double, Suite
        private double pricePerNight;

        public Room(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight) throws HotelDataException {
            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);

            if (roomNumber == null || roomNumber.isEmpty()) throw new HotelDataException("roomNumber required");
            if (roomType == null || roomType.isEmpty()) throw new HotelDataException("roomType required");
            if (pricePerNight <= 0) throw new HotelDataException("pricePerNight must be > 0");

            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.pricePerNight = pricePerNight;
        }

        public String getRoomNumber() { return roomNumber; }
        public String getRoomType() { return roomType; }
        public double getPricePerNight() { return pricePerNight; }
    }


