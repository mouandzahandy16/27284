package id27284.q5;
import java.time.LocalDate;
import java.util.Scanner;

    public class MainQ5 {

        private static final String STUDENT_ID = "27284";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("=== VEHICLE RENTAL SYSTEM (Q5) ===");

                System.out.print("Enter ID: ");
                int id = Integer.parseInt(sc.nextLine());
                LocalDate today = LocalDate.now();

                System.out.print("Vehicle Number: ");
                String vehicleNumber = sc.nextLine();
                System.out.print("Model: ");
                String model = sc.nextLine();
                System.out.print("Rental rate per day: ");
                double rate = Double.parseDouble(sc.nextLine());

                System.out.print("Customer name: ");
                String customerName = sc.nextLine();
                System.out.print("Customer email: ");
                String customerEmail = sc.nextLine();
                System.out.print("Customer contact (10 digits): ");
                String contact = sc.nextLine();

                System.out.print("Rental date (YYYY-MM-DD): ");
                LocalDate rentalDate = LocalDate.parse(sc.nextLine());
                System.out.print("Return date (YYYY-MM-DD): ");
                LocalDate returnDate = LocalDate.parse(sc.nextLine());

                System.out.print("Insurance type: ");
                String insuranceType = sc.nextLine();
                System.out.print("Insurance cost: ");
                double insuranceCost = Double.parseDouble(sc.nextLine());

                System.out.print("Payment method: ");
                String paymentMethod = sc.nextLine();
                System.out.print("Payment date (YYYY-MM-DD): ");
                LocalDate paymentDate = LocalDate.parse(sc.nextLine());

                System.out.print("Vehicle returned in good condition? (true/false): ");
                boolean goodCondition = Boolean.parseBoolean(sc.nextLine());

                System.out.print("Damage cost (0 if none): ");
                double damageCost = Double.parseDouble(sc.nextLine());

                RentalRecord record = new RentalRecord(
                        id, today, today,
                        vehicleNumber, model, rate,
                        customerName, customerEmail, contact,
                        rentalDate, returnDate,
                        insuranceType, insuranceCost,
                        paymentMethod, paymentDate,
                        goodCondition,
                        damageCost
                );

                double total = record.calculateTotalRentalCost();

                System.out.println("\n=== RESULT (" + STUDENT_ID + ") ===");
                System.out.println("Vehicle: " + model + " (" + vehicleNumber + ") | " + STUDENT_ID);
                System.out.println("Customer: " + customerName);
                System.out.println("Rental Days: " +
                        java.time.temporal.ChronoUnit.DAYS.between(rentalDate, returnDate));
                System.out.println("Insurance: " + insuranceType + " | " + insuranceCost);
                System.out.println("Damage Cost: " + damageCost);
                System.out.println("Total Rental Cost: " + total + " | " + STUDENT_ID);

            } catch (RentalDataException ex) {
                System.err.println("ERROR: " + ex.getMessage() + " | " + STUDENT_ID);
            } catch (Exception ex) {
                System.err.println("Unexpected error: " + ex.getMessage() + " | " + STUDENT_ID);
            }

            sc.close();
        }
    }


