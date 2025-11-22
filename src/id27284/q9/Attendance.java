package id27284.q9;


public class Attendance extends Enrollment {
    private int attendedClasses;
    private int totalClasses;

    public Attendance(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String location,
                      String departmentName,
                      String programName,
                      String courseCode, String courseTitle,
                      String studentName, String email,
                      java.time.LocalDate enrollmentDate,
                      int attendedClasses, int totalClasses)
            throws StudentDataException {

        super(id, createdDate, updatedDate, schoolName, location,
                departmentName, programName, courseCode, courseTitle,
                studentName, email, enrollmentDate);

        if (attendedClasses < 0 || totalClasses <= 0 || attendedClasses > totalClasses)
            throw new StudentDataException("Invalid attendance data");

        this.attendedClasses = attendedClasses;
        this.totalClasses = totalClasses;
    }

    public double getAttendancePercentage() {
        return (attendedClasses * 100.0) / totalClasses;
    }
}
