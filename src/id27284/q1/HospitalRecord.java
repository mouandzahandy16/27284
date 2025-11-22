package id27284.q1;

    public final class HospitalRecord extends Bill {

        public HospitalRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                              String hospitalName, String address, String phoneNumber, String email,
                              String departmentName, String departmentCode,
                              String doctorName, String specialization, String doctorEmail, String phone,
                              String nurseName, String shift, int yearsOfExperience,
                              String patientName, int age, String gender, String contactNumber,
                              java.time.LocalDate admissionDate, String roomNumber, double roomCharges,
                              String diagnosis, String treatmentGiven, double treatmentCost,
                              double doctorFee, double medicineCost) throws HospitalDataException {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                    departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                    nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
                    admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
                    doctorFee, medicineCost);
        }

        public double generateBill() {
            double total = getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
            setTotalBill(total);
            return total;
        }
    }


