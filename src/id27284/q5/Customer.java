package id27284.q5;

    public class Customer extends Vehicle {
        private String customerName;
        private String customerEmail;
        private String contactNumber;

        public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                        String vehicleNumber, String model, double rentalRatePerDay,
                        String customerName, String customerEmail, String contactNumber)
                throws RentalDataException {

            super(id, createdDate, updatedDate, vehicleNumber, model, rentalRatePerDay);

            if (customerName == null || customerName.isEmpty())
                throw new RentalDataException("customerName required");
            if (!customerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
                throw new RentalDataException("invalid customerEmail");
            if (!contactNumber.matches("\\d{10}"))
                throw new RentalDataException("contactNumber must be 10 digits");

            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.contactNumber = contactNumber;
        }

        public String getCustomerName() { return customerName; }
    }


