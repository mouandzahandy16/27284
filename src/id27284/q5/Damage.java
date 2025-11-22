package id27284.q5;

    public class Damage extends Return {
        private double damageCost;

        public Damage(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String vehicleNumber, String model, double rentalRatePerDay,
                      String customerName, String customerEmail, String contactNumber,
                      java.time.LocalDate rentalDate, java.time.LocalDate returnDate,
                      String insuranceType, double insuranceCost,
                      String paymentMethod, java.time.LocalDate paymentDate,
                      boolean vehicleReturnedInGoodCondition,
                      double damageCost) throws RentalDataException {

            super(id, createdDate, updatedDate, vehicleNumber, model, rentalRatePerDay,
                    customerName, customerEmail, contactNumber,
                    rentalDate, returnDate, insuranceType, insuranceCost,
                    paymentMethod, paymentDate, vehicleReturnedInGoodCondition);

            if (damageCost < 0)
                throw new RentalDataException("damageCost must be >= 0");

            this.damageCost = damageCost;
        }

        public double getDamageCost() { return damageCost; }
    }


