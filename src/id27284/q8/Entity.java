package id27284.q8;
import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("ID must be > 0");
        if (createdDate == null || updatedDate == null)
            throw new LibraryDataException("Dates cannot be null");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
}
