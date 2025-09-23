public class DocumentProxy implements Document {

    RealDocument realDocument;
    AccessControlService service;

    public DocumentProxy(RealDocument realDocument) {
        this.realDocument = realDocument;
        this.service = AccessControlService.getInstance();

    }

    @Override
    public int getId() {
        return realDocument.getId();
    }

    @Override
    public String getContent(User user) {
        if (service.isAllowed(realDocument.getId(), user)) {
            return realDocument.getContent(user);
            } else {
                return "user has no access to document content";
            }
    }

    @Override
    public String getCreationDate() {
        return realDocument.getCreationDate();
    }
}
