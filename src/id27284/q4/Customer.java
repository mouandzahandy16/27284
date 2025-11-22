package id27284.q4;


    public class Customer extends Room {
        private String customerName;
        private String customerEmail;
        private String contactNumber;

        public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                        String hotelName, String address, String phoneNumber, String email,
                        String roomNumber, String roomType, double pricePerNight,
                        String customerName, String customerEmail, String contactNumber) throws HotelDataException {
            super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);

            if (customerName == null || customerName.isEmpty()) throw new HotelDataException("customerName required");
            if (!customerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HotelDataException("invalid customerEmail");
            if (!contactNumber.matches("\\d{10}")) throw new HotelDataException("contactNumber must be 10 digits");

            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.contactNumber = contactNumber;
        }

        public String getCustomerName() { return customerName; }
        public String getCustomerEmail() { return customerEmail; }
        public String getContactNumber() { return contactNumber; }
    }


