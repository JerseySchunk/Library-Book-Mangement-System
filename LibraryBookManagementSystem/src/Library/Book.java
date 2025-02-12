/**
 * This is the book class that contains all the attributes of a book.
 * those attributes are Title Author ISBN and Price.
 * it comes with constructors parameterized constructors and copy constructors.
 * there is also a method that sets all values to strings and the last one checks if two books are the same.
 */
package Library;

public class Book {
    // Private attributes
    private String title;
    private String author;
    private String ISBN;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.ISBN = "Unknown";
        this.price = 0.0;}

    // Parameterized constructor
    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.ISBN = other.ISBN;
        this.price = other.price;
    }


    //Getters and setters 
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding toString() method
    public String toString() {
        return "Book[Title = " + title + ", Author = " + author + ", ISBN = " + ISBN + ", Price = " + price + "]";
    }

    // Overriding equals() method
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return this.ISBN.equals(book.ISBN);
    }
}