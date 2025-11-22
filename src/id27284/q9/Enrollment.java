package id27284.q9;
import java.time.LocalDate;

public class Enrollment extends Student {
    private LocalDate enrollmentDate;

    public Enrollment(int id, LocalDate createdDate, LocalDate updatedDate,
                      String schoolName, String location,
                      String departmentName,
                      String programName,
                      String courseCode, String courseTitle,
                      String studentName, String email,
                      LocalDate enrollmentDate)
            throws StudentDataException {

        super(id, createdDate, updatedDate, schoolName, location,
                departmentName, programName, courseCode, courseTitle,
                studentName, email);

        if (enrollmentDate == null)
            throw new StudentDataException("enrollmentDate required");

        this.enrollmentDate = enrollmentDate;
    }
}
