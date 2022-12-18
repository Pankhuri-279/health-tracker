import java.util.*;
import java.time.LocalDateTime;

public class FitnessDiary extends Diary {
  private List<Exercise> exerciseRecords = new ArrayList<Exercise>();

  public boolean addRecord(Object entry){
    if(entry instanceof Exercise){
      exerciseRecords.add((Exercise)entry); 
      this.lastUpdated = LocalDateTime.now();
      return true;
    }
    else{
      return false;
    }
  }
  
  public Object[] getAllRecords(){
    Object[] recs = new Object[exerciseRecords.size()];
        for (int i = 0; i < exerciseRecords.size(); i++) {
            recs[i] = exerciseRecords.get(i);
        }
        
        return recs;
  }

  public double getCalsBurned(){
        double cals = 0.0;
        for (int i = 0; i < exerciseRecords.size(); i++) {
            cals += exerciseRecords.get(i).calories;
        }
        return cals;
  }

  public Object getRecord(String s){
    for(int i=0; i<exerciseRecords.size(); i++){
      if(exerciseRecords.get(i).entryID == s){
        return exerciseRecords.get(i);
      }
    }
    return null;
  }
  
  public boolean updateRecord(String s, Object o){
    for(int i=0; i<exerciseRecords.size(); i++){
      if(exerciseRecords.get(i).entryID == s){
        Exercise e = (Exercise) o;
        
        exerciseRecords.get(i).type = e.type;
        exerciseRecords.get(i).startTime = e.startTime;
        exerciseRecords.get(i).endTime = e.endTime;
        exerciseRecords.get(i).calories = e.calories;
        
        this.lastUpdated = LocalDateTime.now();
        return true;
      }
    }

    return false;
  }
  
  public boolean deleteRecord(String s){
    for (int i = 0; i < exerciseRecords.size(); i++) {
            if (exerciseRecords.get(i).entryID == s) { 
                exerciseRecords.remove(i);
                this.lastUpdated = LocalDateTime.now();
                return true;
            }
        }
        return false;
  }  
  
}