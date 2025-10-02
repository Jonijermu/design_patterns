package model;

import java.util.ArrayList;
import java.util.List;

public class ChatLog {
    private List<User> users = new ArrayList<>();
    private List<String> messages = new ArrayList<>(); // optional

    public void addUser(User user) { users.add(user); }
    public List<User> getUsers() { return users; }

    public void addMessage(String message) { messages.add(message); }
    public List<String> getMessages() { return messages; }
}
