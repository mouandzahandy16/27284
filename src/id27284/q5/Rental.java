package id27284.q5;
import java.time.LocalDate;

    public class Rental extends Customer {
        private LocalDate rentalDate;
        private LocalDate returnDate;

        public Rental(int id, LocalDate createdDate, LocalDate updatedDate,
                      String vehicleNumber, String model, double rentalRatePerDay,
                      String customerName, String customerEmail, String contactNumber,
                      LocalDate rentalDate, LocalDate returnDate) throws RentalDataException {

            super(id, createdDate, updatedDate, vehicleNumber, model, rentalRatePerDay,
                    customerName, customerEmail, contactNumber);

            if (rentalDate == null || returnDate == null)
                throw new RentalDataException("dates cannot be null");

            if (!returnDate.isAfter(rentalDate))
                throw new RentalDataException("returnDate must be after rentalDate");

            this.rentalDate = rentalDate;
            this.returnDate = returnDate;
        }

        public LocalDate getRentalDate() { return rentalDate; }
        public LocalDate getReturnDate() { return returnDate; }
    }


