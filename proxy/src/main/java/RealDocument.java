public class RealDocument implements Document {

    int id;
    String content;
    String createdAt;

    public RealDocument(int id, String content, String createdAt) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getContent(User user) {
        return this.content;
    }


    @Override
    public String getCreationDate() {
        return this.createdAt;
    }
}
