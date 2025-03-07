
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

class User {
    private String name;
    private String userID;
    private List<Book> borrowedBooks;

    // Constructor
    
    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getName() { return name; }
    public String getUserID() { return userID; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            JOptionPane.showMessageDialog(null, name + " borrowed: " + book.getTitle());
            
        } else {
            JOptionPane.showMessageDialog(null, "is not available");
           
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            JOptionPane.showMessageDialog(null, name + " returned: " + book.getTitle());
            System.out.println();
        } else {
            JOptionPane.showMessageDialog(null, name + " does not have this book.");
        }
    }

    public void displayUser() {
        JOptionPane.showMessageDialog(null, "User: " + name + ", ID: " + userID + ", Borrowed Books: " + borrowedBooks.size());
        System.out.println();
    }
  
}
