package id27284.q5;
import java.time.LocalDate;

    public class Payment extends Insurance {
        private String paymentMethod;
        private LocalDate paymentDate;

        public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                       String vehicleNumber, String model, double rentalRatePerDay,
                       String customerName, String customerEmail, String contactNumber,
                       LocalDate rentalDate, LocalDate returnDate,
                       String insuranceType, double insuranceCost,
                       String paymentMethod, LocalDate paymentDate)
                throws RentalDataException {

            super(id, createdDate, updatedDate, vehicleNumber, model, rentalRatePerDay,
                    customerName, customerEmail, contactNumber,
                    rentalDate, returnDate, insuranceType, insuranceCost);

            if (paymentMethod == null || paymentMethod.isEmpty())
                throw new RentalDataException("paymentMethod required");
            if (paymentDate == null)
                throw new RentalDataException("paymentDate required");

            this.paymentMethod = paymentMethod;
            this.paymentDate = paymentDate;
        }

        public String getPaymentMethod() { return paymentMethod; }
    }


