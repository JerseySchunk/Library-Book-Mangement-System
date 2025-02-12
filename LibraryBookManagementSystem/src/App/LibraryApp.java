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
		
		Book book1 = new Book("Wheel of Time", "Robert Jordan", "12353235", 00.30);
		Book book2 = new Book("Spice and Wolf Anniversary Collectors edition", "Isuna Hasekura", "123456789", 175.00);
		Book book3 = new Book("Kitty and the Midnight Hour", "Carrie Vaughn", "1234567893", 7.99);
		/**
		 * Adding Books to the new Library
		 */
		
		newLibrary.addBook(book1);
		newLibrary.addBook(book2);
		newLibrary.addBook(book3);
		
		/**
		 * Searching by ISBN
		 */

		Book findBook = newLibrary.searchByISBN("123456789");
		if (findBook != null) {
			System.out.println("Looking for book with ISBN: "  +findBook.getISBN());
			System.out.println("Book found: " + findBook);
		}
		else {
			System.out.println("Book not found");
		}
		
		System.out.println("Displaying all books in Library");
		newLibrary.displayBooks();
		
		/**
		 * Displaying books and removing books
		 */
		
		newLibrary.removeBook(book3);
		
		newLibrary.displayBooks();

		newLibrary.removeBook(book3);
	}

}
