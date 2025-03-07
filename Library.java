
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
class Library {
    private List<Book> books;
    private List<User> users;
    String bokString;
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        JOptionPane.showMessageDialog(null,book.getTitle() + " added to the library.");
        
    }

    public void registerUser(User user) {
        users.add(user);
        JOptionPane.showMessageDialog(null, "User " + user.getName() + " registered.");
    }

    public void issueBook(User user, Book book) {
        user.borrowBook(book);
    }

    // Accept a returned book
    public void returnBook(User user, Book book) {
        user.returnBook(book);
    }

    // Display all books in the library
    public void displayBooks() {

        for (Book book : books) {
            
        }
    }

    // Display all registered users
    public void displayUsers() {
        JOptionPane.showMessageDialog(null,"\nRegistered Users:");
        
        for (User user : users) {
            user.displayUser();
        }

    }
 
}
