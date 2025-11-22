package id27284.q5;


    public class Invoice extends Damage {
        private double totalAmount;

        public Invoice(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                    paymentMethod, paymentDate, vehicleReturnedInGoodCondition,
                    damageCost);

            this.totalAmount = 0;
        }

        public double getTotalAmount() { return totalAmount; }
        public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    }

