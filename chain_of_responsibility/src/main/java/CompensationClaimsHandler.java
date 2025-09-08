public class CompensationClaimsHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Processing compensation claim from: " + message.getEmail());
            System.out.println("Message content: " + message.getContent());

        } else {
            super.handle(message);
        }

    }
}
