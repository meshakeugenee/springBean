package spring.SpringProj;

public class Book {
    private String title;
    private String author;

    // Constructor with parameters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Default constructor (optional but useful for other cases)
    public Book() {}

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               '}';
    }
}
