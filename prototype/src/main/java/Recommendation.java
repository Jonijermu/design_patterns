import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public void removeBook(String title) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("Book \"" + title + "\" removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Couldn't find a book that matches the title \"" + title + "\".");
        }
    }

    @Override
    public Recommendation clone() {
        Recommendation recommendation = new Recommendation(this.targetAudience);
        for (Book b : books) {
            recommendation.addBook(b.clone());
        }
        return recommendation;
    }

    public void printInformation() {
        System.out.println("Recommendation for " + targetAudience + "':");
        for (Book book : books) {
            System.out.println("  - ");
            book.printInformation();
        }
    }
}
