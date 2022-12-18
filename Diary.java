import java.time.LocalDateTime;

public abstract class Diary {
    private LocalDateTime dateCreated = LocalDateTime.now();
    protected LocalDateTime lastUpdated = LocalDateTime.now();

    abstract boolean addRecord(Object entry);
    abstract Object[] getAllRecords();
    abstract Object getRecord(String entrID);
    abstract boolean updateRecord(String entryID, Object updatedRecord);
    abstract boolean deleteRecord(String entryID);

    public String toString() {
        return "Diary Entry of type " + this.getClass() + " created on " + this.dateCreated + " and updated on " + this.lastUpdated;
    } 
}
