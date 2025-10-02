package model;

import java.util.ArrayList;
import java.util.List;

public class ChatBroadcaster implements Mediator{
    private List<User> users;

    public ChatBroadcaster() {
        users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        user.setMediator(this);
    }

    @Override
    public void sendMessage(String message, User sender, User recipient) {
        if (recipient == null) {
            for (User user : users) {
                if (!user.equals(sender)) {
                    user.receive(message, sender);
                }
            }
        } else {
            recipient.receive(message, sender);
        }
    }
}
