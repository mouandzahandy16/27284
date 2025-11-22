package id27284.q3;


public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode)
            throws PayrollDataException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);

        if (departmentName == null || departmentName.isEmpty())
            throw new PayrollDataException("departmentName required");
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[A-Za-z0-9]+"))
            throw new PayrollDataException("departmentCode must be >=3 chars and alphanumeric");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}


