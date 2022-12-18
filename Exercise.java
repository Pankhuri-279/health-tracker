import java.time.LocalTime;
import java.time.Duration;


public class Exercise implements DiaryEntry {
	public String entryID;
	public String type;
	public LocalTime startTime;
	public LocalTime endTime;
	public double calories;
	
	public Exercise(String type,LocalTime startTime,LocalTime endTime ){
		this.type=type;
		this.startTime=startTime;
		this.endTime=endTime;
		Duration duration = Duration.between(startTime, endTime);
		if(type.equals("jogging"))
		{
			this.calories=duration.toSeconds()*700/3600;
		}
		else if(type.equals("jumping jacks"))
		{
			this.calories=duration.toSeconds()*16/60;
		}
		else if(type.equals("cycling"))
		{
			this.calories=duration.toSeconds()*100/3600;
		}
		else if(type.equals("skipping"))
		{
			this.calories=duration.toSeconds()*20/60;
		}
	}
	
	public String toString() {
        return "Exercise: " + this.type + " | StartTime: " + this.startTime + " | EndTime: " + this.endTime + " | Calories: " + this.calories;
    }
	

	

}
