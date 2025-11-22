package id27284.q8;


    public class Section extends Library {
        private String sectionName;

        public Section(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String libraryName, String address,
                       String sectionName)
                throws LibraryDataException {
            super(id, createdDate, updatedDate, libraryName, address);

            if (sectionName == null || sectionName.isEmpty())
                throw new LibraryDataException("sectionName required");

            this.sectionName = sectionName;
        }

        public String getSectionName() { return sectionName; }
    }

