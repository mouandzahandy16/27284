package id27284.q5;


    public class Vehicle extends Entity {
        private String vehicleNumber;
        private String model;
        private double rentalRatePerDay;

        public Vehicle(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String vehicleNumber, String model, double rentalRatePerDay)
                throws RentalDataException {

            super(id, createdDate, updatedDate);

            if (vehicleNumber == null || vehicleNumber.isEmpty())
                throw new RentalDataException("vehicleNumber required");
            if (model == null || model.isEmpty())
                throw new RentalDataException("model required");
            if (rentalRatePerDay <= 0)
                throw new RentalDataException("rentalRatePerDay must be > 0");

            this.vehicleNumber = vehicleNumber;
            this.model = model;
            this.rentalRatePerDay = rentalRatePerDay;
        }

        public String getVehicleNumber() { return vehicleNumber; }
        public String getModel() { return model; }
        public double getRentalRatePerDay() { return rentalRatePerDay; }
    }


