package az.turingacademy.module02.WalletApp;

public class Users {
    private String name;
    private long userId;
    private String email;

    public Users(String name, long userId, String email) {
        this.name = name;
        this.userId = userId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
