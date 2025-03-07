

import javax.swing.JOptionPane;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private String date;
    private boolean isAvailable;
    public Book(){
        
    }
    public Book(String title, String author, String ISBN, String date) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.date = date;
        this.isAvailable = true;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public String getDate() { return date; }
    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            JOptionPane.showMessageDialog(null,title + " has been borrowed.");
            
        } else {
            JOptionPane.showMessageDialog(null,title + " is already borrowed.");
            
        }
    }

    public void returnBook() {
        isAvailable = true;
        JOptionPane.showMessageDialog(null,title + " has been returned.");
    }

    public void displayBook() {
        JOptionPane.showMessageDialog(null,"Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + isAvailable);
        
    }
}
