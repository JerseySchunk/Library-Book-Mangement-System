package Library;

public class Book {
	// Private attributes
    private String title;
    private String author;
    private String ISBN;
    double price;
    
    // This sets all values to be Unknown or 0.0 upon creation 
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.ISBN = "Unknown";
        this.price = 0.0;}
    
    // Parameterized constructor so that new books will be correctly formated and have all needed information
    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;}
    
    // Copy constructor sets copy values 
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.ISBN = other.ISBN;
        this.price = other.price;
    }
    
	public String getTitle() { //getters and setters
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

    

	}


