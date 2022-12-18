import java.util.HashMap;

public class User {
    public Authentication authInfo;
    private String name;
    private int age;
    private double height;
    private double weight;
    private double BMI;
    public Diary dietdiary = new DietDiary(); 
    public Diary fitnessdiary = new FitnessDiary(); 

    public User() {
        this.name = "NO_NAME";
        this.age = 20;
        this.height = 150;
        this.weight = 50;
        this.BMI = this.weight/((this.height/100)*(this.height/100));
        this.authInfo = new Authentication("anonymous user", "user123");
    }

    public User(String name, int age, double weight, double height, String userID, String password) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.BMI = this.weight/((this.height/100)*(this.height/100));
        this.authInfo = new Authentication(userID, password);
    }

    public HashMap<String,Object> getUserInfo() {
        HashMap<String,Object> userInfo = new HashMap<String,Object>();
        userInfo.put("userID", this.authInfo.userID);
        userInfo.put("name", this.name);
        userInfo.put("age", this.age);
        userInfo.put("height", this.height);
        userInfo.put("weight", this.weight);
        userInfo.put("BMI", this.BMI);

        return userInfo;
    }

    public String toString() {
        String user = new String();
        user = "Hello " + this.name; 
        return user;
    }

    public boolean updateUserInfo(HashMap<String,Object> newInfo) {
        if(newInfo.containsKey("name")) {
            this.name = (String)newInfo.get("name");
        }
        if(newInfo.containsKey("age")) {
            this.name = (String)newInfo.get("name");
        }
        if(newInfo.containsKey("height")) {
            this.height = (double)newInfo.get("height");
            this.BMI = this.weight/((this.height/100)*(this.height/100));
        }
        if(newInfo.containsKey("weight")) {
            this.weight = (double)newInfo.get("weight");
            this.BMI = this.weight/((this.height/100)*(this.height/100)); 
        }
        return true;
    }
}
