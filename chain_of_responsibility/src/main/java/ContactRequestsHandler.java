


public class ContactRequestsHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Processing contact request from: " + message.getEmail());
            System.out.println("Message content: " + message.getContent());
        } else {
            super.handle(message);

        }

    }
}
