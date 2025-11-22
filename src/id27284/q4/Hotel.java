package id27284.q4;


    public class Hotel extends Entity {
        private String hotelName;
        private String address;
        private String phoneNumber;
        private String email;

        public Hotel(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String hotelName, String address, String phoneNumber, String email) throws HotelDataException {
            super(id, createdDate, updatedDate);

            if (hotelName == null || hotelName.isEmpty()) throw new HotelDataException("hotelName required");
            if (address == null || address.isEmpty()) throw new HotelDataException("address required");
            if (!phoneNumber.matches("\\d{10}")) throw new HotelDataException("phone must be 10 digits");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HotelDataException("invalid email");

            this.hotelName = hotelName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getHotelName() { return hotelName; }
        public String getAddress() { return address; }
        public String getPhoneNumber() { return phoneNumber; }
        public String getEmail() { return email; }
    }


