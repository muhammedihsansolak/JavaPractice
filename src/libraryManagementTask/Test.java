package libraryManagementTask;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Book b1 = new Book("Huzursuzluğun Kitabı", "Fernando Pessoa", false);
        Book b2 = new Book("Breaking the habit of being yourself", "Dr. Joe Dispenza", false);
        Book b3 = new Book("Zero Limit", "Joe Vitale", true);
        Book b4 = new Book("Love your disease", "Valeriy Sinelnikov", true);
        Book b5 = new Book("Men searching for meaning", "Viktor Frankl", true);

        Library library = new Library();
        library.bookList.addAll(Arrays.asList(b1, b2, b3, b4, b5));
        library.displayAvailableBooks();
        library.borrowBook(b3);

        library.displayAvailableBooks();

        Book b6 = new Book("Emotional Intelligence", "Daniel Goleman", true);
        library.addBook(b6);
        library.displayAvailableBooks();

    }
}
