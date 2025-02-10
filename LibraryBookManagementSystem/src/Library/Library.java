package Library;

//test
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
	
	//Removes a specified book from the book array.
	//Will check if the provided book is null and if the book is in the array.
	//Will also check if the book being compared to is null to avoid NullPointerExceptions
	//Returns true if successful and false otherwise. 
	public boolean removeBook(Book book) {
		if(book == null) {
			return false;
		}
		
		for(int i = 0; i < count; i++) {			
			if(books[i] != null && books[i].equals(book)) {
				books[i] = books[count - 1];
				books[count - 1] = null;
				count--;
				return true;
			}
		}
		return false;
	}
	
	//Waiting for the book class to be updated with getter methods before I can continue this
	//public Book SearchByISBN(String ISBN) {
		
	
	public void displayBooks() {
		for(int i = 0; i < count; i++) {
			System.out.println(book[i]);
		}
	}
	

}
