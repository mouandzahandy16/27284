package id27284.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
        if (doctorName == null || doctorName.isEmpty()) throw new HospitalDataException("doctorName required");
        if (specialization == null || specialization.isEmpty()) throw new HospitalDataException("specialization required");
        if (!doctorEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HospitalDataException("invalid doctorEmail");
        if (!phone.matches("\\d{10}")) throw new HospitalDataException("doctor phone must be 10 digits");
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
    public String getDoctorEmail() { return doctorEmail; }
    public String getPhone() { return phone; }
}

