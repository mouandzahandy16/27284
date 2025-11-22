package id27284.q7;


    public class Agent extends Agency {
        private String agentName;
        private String email;
        private String licenseNumber;

        public Agent(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String email, String licenseNumber) throws RealEstateDataException {
            super(id, createdDate, updatedDate, agencyName, location, phoneNumber);

            if (agentName == null || agentName.isEmpty()) throw new RealEstateDataException("agentName required");
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new RealEstateDataException("invalid email");
            if (licenseNumber == null || licenseNumber.isEmpty()) throw new RealEstateDataException("licenseNumber required");

            this.agentName = agentName;
            this.email = email;
            this.licenseNumber = licenseNumber;
        }

        public String getAgentName() { return agentName; }
        public String getEmail() { return email; }
        public String getLicenseNumber() { return licenseNumber; }
    }


