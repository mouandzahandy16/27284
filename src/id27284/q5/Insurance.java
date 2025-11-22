package id27284.q5;


    public class Insurance extends Rental {
        private String insuranceType;
        private double insuranceCost;

        public Insurance(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                         String vehicleNumber, String model, double rentalRatePerDay,
                         String customerName, String customerEmail, String contactNumber,
                         java.time.LocalDate rentalDate, java.time.LocalDate returnDate,
                         String insuranceType, double insuranceCost)
                throws RentalDataException {

            super(id, createdDate, updatedDate, vehicleNumber, model, rentalRatePerDay,
                    customerName, customerEmail, contactNumber, rentalDate, returnDate);

            if (insuranceType == null || insuranceType.isEmpty())
                throw new RentalDataException("insuranceType required");
            if (insuranceCost < 0) throw new RentalDataException("insuranceCost must be >= 0");

            this.insuranceType = insuranceType;
            this.insuranceCost = insuranceCost;
        }

        public double getInsuranceCost() { return insuranceCost; }
    }


