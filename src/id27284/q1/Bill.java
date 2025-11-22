package id27284.q1;

    public class Bill extends Treatment {
        private double doctorFee;
        private double medicineCost;
        private double totalBill;

        public Bill(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                    admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);
            if (doctorFee <= 0) throw new HospitalDataException("doctorFee must be > 0");
            if (medicineCost <= 0) throw new HospitalDataException("medicineCost must be > 0");
            this.doctorFee = doctorFee;
            this.medicineCost = medicineCost;
            this.totalBill = 0; // will be set by HospitalRecord
        }

        public double getDoctorFee() { return doctorFee; }
        public double getMedicineCost() { return medicineCost; }
        public double getTotalBill() { return totalBill; }
        public void setTotalBill(double totalBill) { this.totalBill = totalBill; }
    }


