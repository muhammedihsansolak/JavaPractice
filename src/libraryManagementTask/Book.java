package libraryManagementTask;

public class Book {
    //----INSTANCE VARİABLES
    private final String title, author;
    private boolean isAvailable;
    //------CONSTRUCTOR
    public Book(String title, String author, boolean isAvailable) {
        if (title.isEmpty()||title.isBlank()) throw new RuntimeException("Invalid title");
        this.title = title;
        if (author.isEmpty()||author.isBlank()) throw new RuntimeException("Invalid author");
        this.author = author;
        this.isAvailable = isAvailable;
    }
    //-------GETTER AND SETTERS
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    //-----ToString

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
