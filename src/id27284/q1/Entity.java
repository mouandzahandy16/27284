package id27284.q1;
import java.time.LocalDate;

public class Entity {

        private int id;
        private LocalDate createdDate;
        private LocalDate updatedDate;

        public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws HospitalDataException {
            if (id <= 0) throw new HospitalDataException("id must be > 0");
            if (createdDate == null || updatedDate == null) throw new HospitalDataException("dates cannot be null");
            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() { return id; }
        public LocalDate getCreatedDate() { return createdDate; }
        public LocalDate getUpdatedDate() { return updatedDate; }

        public void setUpdatedDate(LocalDate updatedDate) throws HospitalDataException {
            if (updatedDate == null) throw new HospitalDataException("updatedDate cannot be null");
            this.updatedDate = updatedDate;
        }
    }


