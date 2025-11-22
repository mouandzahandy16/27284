package id27284.q1;

import java.time.LocalDate;
import java.util.Scanner;

    public class MainQ1 {
        private static final String STUDENT_ID = "27284";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("=== Hospital Management System (Q1) ===");

                System.out.print("Enter entity id (int >0): ");
                int id = Integer.parseInt(sc.nextLine());

                LocalDate today = LocalDate.now();

                System.out.print("Hospital name: ");
                String hospitalName = sc.nextLine();
                System.out.print("Hospital address: ");
                String address = sc.nextLine();
                System.out.print("Hospital phone (10 digits): ");
                String phone = sc.nextLine();
                System.out.print("Hospital email: ");
                String email = sc.nextLine();

                System.out.print("Department name: ");
                String depName = sc.nextLine();
                System.out.print("Department code (alphanumeric, >=3): ");
                String depCode = sc.nextLine();

                System.out.print("Doctor name: ");
                String docName = sc.nextLine();
                System.out.print("Doctor specialization: ");
                String specialization = sc.nextLine();
                System.out.print("Doctor email: ");
                String docEmail = sc.nextLine();
                System.out.print("Doctor phone (10 digits): ");
                String docPhone = sc.nextLine();

                System.out.print("Nurse name: ");
                String nurseName = sc.nextLine();
                System.out.print("Nurse shift (Day/Night): ");
                String shift = sc.nextLine();
                System.out.print("Nurse years of experience (int >=0): ");
                int yrs = Integer.parseInt(sc.nextLine());

                System.out.print("Patient name: ");
                String patientName = sc.nextLine();
                System.out.print("Patient age (int >0): ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Patient gender (Male/Female/Other): ");
                String gender = sc.nextLine();
                System.out.print("Patient contact (10 digits): ");
                String contact = sc.nextLine();

                System.out.print("Admission date (YYYY-MM-DD): ");
                LocalDate admissionDate = LocalDate.parse(sc.nextLine());
                System.out.print("Room number: ");
                String roomNo = sc.nextLine();
                System.out.print("Room charges (double >0): ");
                double roomCharges = Double.parseDouble(sc.nextLine());

                System.out.print("Diagnosis: ");
                String diagnosis = sc.nextLine();
                System.out.print("Treatment given: ");
                String treatmentGiven = sc.nextLine();
                System.out.print("Treatment cost (double >0): ");
                double treatmentCost = Double.parseDouble(sc.nextLine());

                System.out.print("Doctor fee (double >0): ");
                double doctorFee = Double.parseDouble(sc.nextLine());
                System.out.print("Medicine cost (double >0): ");
                double medicineCost = Double.parseDouble(sc.nextLine());

                HospitalRecord record = new HospitalRecord(
                        id, today, today,
                        hospitalName, address, phone, email,
                        depName, depCode,
                        docName, specialization, docEmail, docPhone,
                        nurseName, shift, yrs,
                        patientName, age, gender, contact,
                        admissionDate, roomNo, roomCharges,
                        diagnosis, treatmentGiven, treatmentCost,
                        doctorFee, medicineCost
                );

                double total = record.generateBill();

                // Display details — concatenate STUDENT_ID to output as required
                System.out.println("\n--- RESULT (concatenated with Student ID " + STUDENT_ID + ") ---");
                System.out.println("Hospital: " + record.getHospitalName() + " | ID: " + STUDENT_ID);
                System.out.println("Department: " + record.getDepartmentName());
                System.out.println("Doctor: " + record.getDoctorName() + " (" + record.getSpecialization() + ")");
                System.out.println("Nurse: " + record.getNurseName() + " | Shift: " + record.getShift());
                System.out.println("Patient: " + record.getPatientName() + " | Age: " + record.getAge() + " | Gender: " + record.getGender());
                System.out.println("Admission Date: " + record.getAdmissionDate() + " | Room: " + record.getRoomNumber());
                System.out.println("Room Charges: " + record.getRoomCharges());
                System.out.println("Treatment: " + record.getDiagnosis() + " | Cost: " + record.getTreatmentCost());
                System.out.println("Doctor Fee: " + record.getDoctorFee());
                System.out.println("Medicine Cost: " + record.getMedicineCost());
                System.out.println("TOTAL BILL: " + total + " | " + STUDENT_ID);

            } catch (HospitalDataException ex) {
                System.err.println("Validation error: " + ex.getMessage() + " | " + "27284");
            } catch (Exception ex) {
                System.err.println("Unexpected error: " + ex.getMessage() + " | " + "27284");
                ex.printStackTrace();
            } finally {
                sc.close();
            }
        }
    }


