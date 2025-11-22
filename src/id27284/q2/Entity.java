package id27284.q2;
import java.time.LocalDate;

    public class Entity {
        private int id;
        private LocalDate createdDate;
        private LocalDate updatedDate;

        public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws SchoolDataException {
            if (id <= 0) throw new SchoolDataException("id must be > 0");
            if (createdDate == null || updatedDate == null)
                throw new SchoolDataException("createdDate and updatedDate cannot be null");

            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() { return id; }
        public LocalDate getCreatedDate() { return createdDate; }
        public LocalDate getUpdatedDate() { return updatedDate; }
    }


