import java.time.LocalDateTime;

public interface DiaryEntry {
    LocalDateTime entryID = LocalDateTime.now();
    String type = null;
    double calories = 0;

    public String toString();
}