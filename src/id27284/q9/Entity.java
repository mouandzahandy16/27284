package id27284.q9;


import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate)
            throws StudentDataException {
        if (id <= 0) throw new StudentDataException("ID must be > 0");
        if (createdDate == null || updatedDate == null)
            throw new StudentDataException("Dates cannot be null");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
