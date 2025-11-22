package id27284.q9;


public final class StudentRecord extends Assessment {

    public StudentRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                attendedClasses, totalClasses,
                assignmentMark, examMark);
    }

    public double calculateFinalGrade() {
        return (getAssignmentMark() * 0.4) + (getExamMark() * 0.6);
    }
}
