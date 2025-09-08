public class DevelopmentSuggestionsHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Processing development suggestion from: " + message.getEmail());
            System.out.println("Message content: " + message.getContent());
        } else {
            super.handle(message);
        }
    }
}
