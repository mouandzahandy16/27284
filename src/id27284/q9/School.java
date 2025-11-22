package id27284.q9;


public class School extends Entity {
    private String schoolName;
    private String location;

    public School(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String schoolName, String location)
            throws StudentDataException {
        super(id, createdDate, updatedDate);

        if (schoolName == null || schoolName.isEmpty())
            throw new StudentDataException("schoolName required");
        if (location == null || location.isEmpty())
            throw new StudentDataException("location required");

        this.schoolName = schoolName;
        this.location = location;
    }
}
