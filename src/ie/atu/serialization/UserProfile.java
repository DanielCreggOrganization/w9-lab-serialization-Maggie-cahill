package ie.atu.serialization;

import java.io.*;

public class UserProfile implements Serializable {
    private String username;
    private transient String password;
    private transient int loginAttempts;
    private String email;

    public UserProfile(String username, String password, int loginAttempts, String email) {
        this.username = username;
        this.password = password;
        this.loginAttempts = loginAttempts;
        this.email = email;
    }

    @Override 
    public String toString() {
        return String.format("UserProfile{username='%s', password = '%s', " +
                             "loginAttempts=%d, email = '%s'}",
                             username, password, loginAttempts, email);
    } 
}
