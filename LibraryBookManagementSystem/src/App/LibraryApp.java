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
		Book book4 = new Book("Place Holder 7", "Placeholder 6", "1234567893", 20.99);
		Book book5 = new Book("Place Holder 8", "Placeholder 6", "1234567893", 20.99);
		Book book6 = new Book("Place Holder 9", "Placeholder 6", "1234567893", 20.99);
		/**
		 * Adding Books to the new Library
		 */
		
		newLibrary.addBook(book1);
		newLibrary.addBook(book2);
		newLibrary.addBook(book3);
		newLibrary.addBook(book4);
		newLibrary.addBook(book5);
		newLibrary.addBook(book6);
		
		/**
		 * Searching by ISBN
		 */
		
		newLibrary.searchByISBN("123456789");
		
		Book findBook = newLibrary.searchByISBN("123456789");
		if (findBook != null) {
			System.out.println("Book found: " + findBook);
		}
		else {
			System.out.println("Book not found");
		}
		
		newLibrary.displayBooks();
		
		/**
		 * Displaying books and removing books
		 */
//		newLibrary.removeBook(book3);
//		newLibrary.displayBooks();
		//Testing changes made to displayBook and remove Book methods
	}

}
