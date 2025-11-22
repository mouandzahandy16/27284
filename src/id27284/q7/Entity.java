package id27284.q7;
import java.time.LocalDate;

    public class Entity {
        private int id;
        private LocalDate createdDate;
        private LocalDate updatedDate;

        public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws RealEstateDataException {
            if (id <= 0) throw new RealEstateDataException("id must be > 0");
            if (createdDate == null || updatedDate == null) throw new RealEstateDataException("dates cannot be null");
            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() { return id; }
        public LocalDate getCreatedDate() { return createdDate; }
        public LocalDate getUpdatedDate() { return updatedDate; }
    }


