package id27284.q9;


public class Course extends Program {
    private String courseCode;
    private String courseTitle;

    public Course(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String schoolName, String location,
                  String departmentName,
                  String programName,
                  String courseCode,
                  String courseTitle)
            throws StudentDataException {

        super(id, createdDate, updatedDate, schoolName, location, departmentName, programName);

        if (courseCode == null || courseCode.isEmpty())
            throw new StudentDataException("courseCode required");
        if (courseTitle == null || courseTitle.isEmpty())
            throw new StudentDataException("courseTitle required");

        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }
}
