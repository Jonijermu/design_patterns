package model;

import controller.ChatController;

public class User {

    String name;
    int id;
    int count = 0;
    Mediator mediator;
    ChatController chatController;


    public User(String name) {
        this.name = name;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;

    }

    public void setChatController(ChatController chatController) {
        this.chatController = chatController;
    }

    public void send(String message, User recipient) {
        mediator.sendMessage(message, this, recipient);

    }

    public void receive(String message, User sender) {
        if (chatController != null) {
            chatController.displayMessage(sender.getName() + ": " + message);
        }
    }
    @Override
    public String toString() {
        return name;
    }
    }