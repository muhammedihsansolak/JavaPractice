package libraryManagementTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book b) {
        bookList.add(b);
    }

    public void borrowBook(Book b) {

        int i = bookList.indexOf(b);
        Book B = bookList.get(i);
        if (b.isAvailable()) {
            b.setAvailable(false);
        } else {
            throw new RuntimeException("Unavailable Book "+b.getTitle());
        }
    }

    public void returnBook(Book b) {
        int i = bookList.indexOf(b);
        Book B = bookList.get(i);
        if (!b.isAvailable()) {
            b.setAvailable(true);
        } else {
            throw new RuntimeException("This book has already returned");
        }
    }
    public void displayAvailableBooks(){
        System.out.println("Available books are: ");
        for (Book each : bookList) {
            if (each.isAvailable()) {
                System.out.print(each.getTitle()+", ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                '}';
    }
}
