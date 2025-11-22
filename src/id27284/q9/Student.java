package id27284.q9;


public class Student extends Course {
    private String studentName;
    private String email;

    public Student(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String schoolName, String location,
                   String departmentName,
                   String programName,
                   String courseCode, String courseTitle,
                   String studentName, String email)
            throws StudentDataException {

        super(id, createdDate, updatedDate, schoolName, location,
                departmentName, programName, courseCode, courseTitle);

        if (studentName == null || studentName.isEmpty())
            throw new StudentDataException("studentName required");

        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new StudentDataException("Invalid email format");

        this.studentName = studentName;
        this.email = email;
    }
}
