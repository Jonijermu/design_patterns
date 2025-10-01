package model;

public class User {

    String name;
    int id;
    int count = 0;

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
}
