package id27284.q1;

    public class Nurse extends Doctor {
        private String nurseName;
        private String shift; // Day or Night
        private int yearsOfExperience;

        public Nurse(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience) throws HospitalDataException {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                    departmentName, departmentCode, doctorName, specialization, doctorEmail, phone);
            if (nurseName == null || nurseName.isEmpty()) throw new HospitalDataException("nurseName required");
            if (!("Day".equalsIgnoreCase(shift) || "Night".equalsIgnoreCase(shift))) throw new HospitalDataException("shift must be Day or Night");
            if (yearsOfExperience < 0) throw new HospitalDataException("yearsOfExperience must be >=0");
            this.nurseName = nurseName;
            this.shift = shift;
            this.yearsOfExperience = yearsOfExperience;
        }

        public String getNurseName() { return nurseName; }
        public String getShift() { return shift; }
        public int getYearsOfExperience() { return yearsOfExperience; }
    }


