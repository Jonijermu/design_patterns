import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype {

    private List<Book> books;
    private String targetAudience;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Recommendation clone() {
        Recommendation recommendation = new Recommendation(this.targetAudience);
        for (Book b : books) {
            recommendation.addBook(b.clone());
        }
        return recommendation;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "targetAudience='" + targetAudience + '\'' +
                ", books=" + books +
                '}';
    }
}
