import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create initial recommendation
        Recommendation students = new Recommendation("Students");
        students.addBook(new Book("J.K. Rowling", "Harry Potter", "Fantasy", 1997));
        students.addBook(new Book("George Orwell", "1984", "Dystopian", 1949));

        System.out.println("Original Recommendation:");
        System.out.println(students);

        // Clone and modify
        Recommendation sciFiFans = students.clone();
        sciFiFans.setTargetAudience("Sci-Fi Fans");
        sciFiFans.addBook(new Book("Isaac Asimov", "Foundation", "Science Fiction", 1951));

        System.out.println("\nCloned and Modified Recommendation:");
        System.out.println(sciFiFans);

        // CLI demo
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a new audience for cloned list:");
        String audience = scanner.nextLine();
        Recommendation custom = sciFiFans.clone();
        custom.setTargetAudience(audience);
        System.out.println("Your new recommendation list:");
        System.out.println(custom);
    }
}
