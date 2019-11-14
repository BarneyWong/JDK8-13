package chapter5;

public class UserDTO {
    private int userId;
    private String username;
    public UserDTO(){

    }
    public UserDTO(int userId,String username){
        this.userId= userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }
}
