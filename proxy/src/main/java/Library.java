import java.util.HashMap;


public class Library {

    HashMap<Integer, Document> documents;

    public Library() {
        this.documents = new HashMap<>();
    }

    public void createUnprotectedDocument(int id, String content, String createdAt) {
        addDocument(new RealDocument(id, content, createdAt));
    }

    public void createProtectedDocument(int id, String content, String createdAt) {
        Document protectedDocument = new DocumentProxy(new RealDocument(id, content, createdAt));
        addDocument(protectedDocument);
    }


    public void addDocument(Document document) {
        documents.put(document.getId(), document);
    }


    public Document getDocumentById(int id) {
        if (documents.containsKey(id)) {
            return documents.get(id);

        }else {
            System.out.println("Dont find document by this identifier");
            return null;
        }

    }
}
