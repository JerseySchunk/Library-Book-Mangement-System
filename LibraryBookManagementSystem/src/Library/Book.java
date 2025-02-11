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

    

	}


