

public class Message {

    MessageType type;
    String content;
    String email;

    public Message(MessageType type, String content, String email) {
        this.type = type;
        this.content = content;
        this.email = email;
    }

    public MessageType getType() {
        return this.type;
    }

    public String getContent() {
        return this.content;
    }

    public String getEmail() {
        return this.email;
    }


}
