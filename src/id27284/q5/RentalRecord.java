package id27284.q5;
import java.time.temporal.ChronoUnit;

    public final class RentalRecord extends Invoice {

        public RentalRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
        }

        public double calculateTotalRentalCost() {
            long days = ChronoUnit.DAYS.between(getRentalDate(), getReturnDate());
            double rentalCost = getRentalRatePerDay() * days;
            double insuranceCost = getInsuranceCost();
            double damageCost = getDamageCost();

            double total = rentalCost + insuranceCost + damageCost;
            setTotalAmount(total);

            return total;
        }
    }


