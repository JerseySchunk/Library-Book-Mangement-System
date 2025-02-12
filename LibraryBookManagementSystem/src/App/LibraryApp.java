package App;

//importing classes
import Library.Library;
import Library.Book;
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Making a Library and adding a book to it  
		 * @param newLibrary
		 */
		Library newLibrary = new Library();
		
		Book book1 = new Book("Place Holder 1", "Placeholder 2", "1235325235", 45.99);
		Book book2 = new Book("Place Holder 3", "Placeholder 4", "123456789", 19.99);
		Book book3 = new Book("Place Holder 5", "Placeholder 6", "1234567893", 20.99);
		
		/**
		 * Adding Books to the new Library
		 */
		
		newLibrary.addBook(book1);
		newLibrary.addBook(book2);
		newLibrary.addBook(book3);
		
		/**
		 * Adding Books to the new Library
		 */
		
		newLibrary.displayBooks();
		newLibrary.removeBook(book3);
		newLibrary.displayBooks();
		//Testing changes made to displayBook and remove Book methods
	}

}
