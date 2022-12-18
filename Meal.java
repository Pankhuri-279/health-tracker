import java.time.LocalDateTime;
import java.time.LocalTime;

public class Meal implements DiaryEntry {
    public LocalDateTime entryID;
    public String type;
    public LocalTime time;
    public double weight;
    public double calories;

    //String[] foods = {"Fruits", "Vegetables", "Curry", "Roti", "Rice", "Ice Cream"};

    public Meal(String food, LocalTime time, int weight) {
        this.entryID = LocalDateTime.now();
        this.time = time;
        this.type = food;
        this.weight = weight;

        if(food.equals("Fruits")) {
            this.calories = this.weight * 0.75;
        } else if (food.equals("Vegetables")) {
            this.calories = this.weight * 0.5;
        } else if (food.equals("Curry")) {
            this.calories = this.weight * 1.25;
        } else if (food.equals("Roti")) {
            this.calories = this.weight * 1.5;
        } else if (food.equals("Rice")) {
            this.calories = this.weight * 1.75;
        } else if (food.equals("Ice Cream")) {
            this.calories = this.weight * 2.5;
        }
        else {
            this.calories = this.weight * 1.5;
        }
    }

    public String toString() {
        return "Food: " + this.type + " | Time: " + this.time.getHour() + " " + this.time.getMinute() + " | Weight: " + this.weight + " | Calories: " + this.calories;
    }
}
