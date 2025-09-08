


public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Processing general feedback from: " + message.getEmail());
            System.out.println("Message content: " + message.getContent());
        } else {
            super.handle(message);

        }
    }
}