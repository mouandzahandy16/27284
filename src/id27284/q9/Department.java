package id27284.q9;


public class Department extends School {
    private String departmentName;

    public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String location,
                      String departmentName)
            throws StudentDataException {
        super(id, createdDate, updatedDate, schoolName, location);

        if (departmentName == null || departmentName.isEmpty())
            throw new StudentDataException("departmentName required");

        this.departmentName = departmentName;
    }
}
