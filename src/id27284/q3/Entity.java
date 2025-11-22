package id27284.q3;
import java.time.LocalDate;

    public class Entity {
        private int id;
        private LocalDate createdDate;
        private LocalDate updatedDate;

        public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws PayrollDataException {
            if (id <= 0) throw new PayrollDataException("id must be > 0");
            if (createdDate == null || updatedDate == null)
                throw new PayrollDataException("dates cannot be null");

            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() { return id; }
        public LocalDate getCreatedDate() { return createdDate; }
        public LocalDate getUpdatedDate() { return updatedDate; }
    }


