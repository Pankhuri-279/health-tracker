import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DietDiary extends Diary{
    private List<Meal> dietRecords = new ArrayList<Meal>();
    
    public boolean addRecord(Object entry) {
        if (entry.getClass().getName()=="Meal") {
            dietRecords.add((Meal)entry); 
            this.lastUpdated = LocalDateTime.now();
            return true;
        } else {
            return false;
        }

    }
    public Object[] getAllRecords() {
        Object[] recs = new Object[dietRecords.size()];
        for (int i = 0; i < dietRecords.size(); i++) {
            recs[i] = dietRecords.get(i);
        }
        
        return recs;
        
    }

    public double getCalsConsumed(){
        double cals = 0.0;
        for (int i = 0; i < dietRecords.size(); i++) {
            cals += dietRecords.get(i).calories;
        }
        return cals;
  }

    public Object getRecord(String entryID) {
        for (int i = 0; i < dietRecords.size(); i++) {
            if (dietRecords.get(i).entryID.toString() == entryID) {
                return dietRecords.get(i);
            }
        }
        return null;
    }
    public boolean updateRecord(String entryID, Object newRecord) {
        if (newRecord.getClass().getName()=="Meal") {
            for (int i = 0; i < dietRecords.size(); i++) {
                if (dietRecords.get(i).entryID.toString() == entryID) { 
                    Meal newRec = (Meal)newRecord;
                    dietRecords.get(i).calories = newRec.calories;
                    dietRecords.get(i).type = newRec.type;
                    dietRecords.get(i).time = newRec.time;
                    dietRecords.get(i).weight = newRec.weight;
                    
                    this.lastUpdated = LocalDateTime.now();
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
    public boolean deleteRecord(String entryID) {
        for (int i = 0; i < dietRecords.size(); i++) {
            if (dietRecords.get(i).entryID.toString() == entryID) { 
                dietRecords.remove(i);
                this.lastUpdated = LocalDateTime.now();
                return true;
            }
        }
        return false;
    }
}
