public class Authentication {
    public String userID;
    private String password;

    public Authentication(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public boolean authenticate(String userID, String password) {
        if (this.userID.equals(userID) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    } 

    public boolean changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)) {
            this.password = String.valueOf(newPassword);
            return true;
        } else {
            return false;
        }
    }
}
