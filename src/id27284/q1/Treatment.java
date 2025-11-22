package id27284.q1;

    public class Treatment extends Admission {
        private String diagnosis;
        private String treatmentGiven;
        private double treatmentCost;

        public Treatment(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                         String hospitalName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String doctorName, String specialization, String doctorEmail, String phone,
                         String nurseName, String shift, int yearsOfExperience,
                         String patientName, int age, String gender, String contactNumber,
                         java.time.LocalDate admissionDate, String roomNumber, double roomCharges,
                         String diagnosis, String treatmentGiven, double treatmentCost) throws HospitalDataException {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                    departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                    nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
                    admissionDate, roomNumber, roomCharges);
            if (diagnosis == null || diagnosis.isEmpty()) throw new HospitalDataException("diagnosis required");
            if (treatmentGiven == null || treatmentGiven.isEmpty()) throw new HospitalDataException("treatmentGiven required");
            if (treatmentCost <= 0) throw new HospitalDataException("treatmentCost must be > 0");
            this.diagnosis = diagnosis;
            this.treatmentGiven = treatmentGiven;
            this.treatmentCost = treatmentCost;
        }

        public String getDiagnosis() { return diagnosis; }
        public String getTreatmentGiven() { return treatmentGiven; }
        public double getTreatmentCost() { return treatmentCost; }
    }


