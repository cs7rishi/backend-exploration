package src;

import java.util.UUID;

public class User {
    UUID uuid;
    String userName;

    public User(String userName) {
        this.uuid = UUID.randomUUID();
        this.userName = userName;
    }
}
