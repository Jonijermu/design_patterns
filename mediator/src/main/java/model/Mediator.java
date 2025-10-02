package model;

public interface Mediator {
    void addUser(User user);

    void sendMessage(String message, User sender, User recipient);
}