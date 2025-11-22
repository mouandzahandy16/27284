package id27284.q4;
import java.time.LocalDate;

    public class Entity {
        private int id;
        private LocalDate createdDate;
        private LocalDate updatedDate;

        public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws HotelDataException {
            if (id <= 0) throw new HotelDataException("id must be > 0");
            if (createdDate == null || updatedDate == null) throw new HotelDataException("dates cannot be null");
            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() { return id; }
        public LocalDate getCreatedDate() { return createdDate; }
        public LocalDate getUpdatedDate() { return updatedDate; }
    }


