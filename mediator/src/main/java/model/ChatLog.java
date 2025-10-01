package model;

import java.util.ArrayList;
import java.util.List;

public class ChatLog {

    List<User> users;

    public ChatLog() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }


}
