package id27284.q9;


public class Assessment extends Attendance {
    private double assignmentMark;
    private double examMark;

    public Assessment(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String location,
                      String departmentName,
                      String programName,
                      String courseCode, String courseTitle,
                      String studentName, String email,
                      java.time.LocalDate enrollmentDate,
                      int attendedClasses, int totalClasses,
                      double assignmentMark, double examMark)
            throws StudentDataException {

        super(id, createdDate, updatedDate, schoolName, location,
                departmentName, programName, courseCode, courseTitle,
                studentName, email, enrollmentDate,
                attendedClasses, totalClasses);

        if (assignmentMark < 0 || examMark < 0)
            throw new StudentDataException("Marks must be >= 0");

        this.assignmentMark = assignmentMark;
        this.examMark = examMark;
    }

    public double getAssignmentMark() { return assignmentMark; }
    public double getExamMark() { return examMark; }
}
