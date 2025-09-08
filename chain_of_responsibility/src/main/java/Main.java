public class Main {

    public static void main(String[] args) {

        Handler primaryHandler;

        Handler compensationHandler = new CompensationClaimsHandler();
        Handler contactHandler = new ContactRequestsHandler();
        Handler developmentHandler = new DevelopmentSuggestionsHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalFeedbackHandler);

        primaryHandler = compensationHandler;
        Message[] messages = {
                new Message(MessageType.COMPENSATION_CLAIM, "I want a refund.", "customer1@example.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add dark mode.", "customer2@example.com"),
                new Message(MessageType.COMPENSATION_CLAIM, "Great service!", "customer3@example.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "customer3@example.com"),
        };

        for (Message msg : messages) {
            primaryHandler.handle(msg);
        }
    }
}
