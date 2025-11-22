package id27284.q9;


public class Program extends Department {
    private String programName;

    public Program(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String schoolName, String location,
                   String departmentName,
                   String programName)
            throws StudentDataException {

        super(id, createdDate, updatedDate, schoolName, location, departmentName);

        if (programName == null || programName.isEmpty())
            throw new StudentDataException("programName required");

        this.programName = programName;
    }
}

