package Library;


//Defining the Library class.
public class Library {
	private Book[] books;
	private int count;
//Constructor to initalize the books array and count.
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	
	//Adds a book to the array if the book is not null and space is available.
	//Returns true if the book is added, false if this fails.
	public boolean addBook(Book book) {
		if(book == null) {
			return false;
		}
		if(count < books.length) {
			books[count] = book;
			count++;
			return true;
		}
		return false;
	}
	
	

}
