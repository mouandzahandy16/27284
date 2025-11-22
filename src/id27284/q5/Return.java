package id27284.q5;


    public class Return extends Payment {
        private boolean vehicleReturnedInGoodCondition;

        public Return(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String vehicleNumber, String model, double rentalRatePerDay,
                      String customerName, String customerEmail, String contactNumber,
                      java.time.LocalDate rentalDate, java.time.LocalDate returnDate,
                      String insuranceType, double insuranceCost,
                      String paymentMethod, java.time.LocalDate paymentDate,
                      boolean vehicleReturnedInGoodCondition) throws RentalDataException {

            super(id, createdDate, updatedDate, vehicleNumber, model, rentalRatePerDay,
                    customerName, customerEmail, contactNumber,
                    rentalDate, returnDate, insuranceType, insuranceCost,
                    paymentMethod, paymentDate);

            this.vehicleReturnedInGoodCondition = vehicleReturnedInGoodCondition;
        }

        public boolean isVehicleReturnedInGoodCondition() {
            return vehicleReturnedInGoodCondition;
        }
    }


