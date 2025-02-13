package App;



//importing classes
import Library.Library;
import Library.Book;
public class LibraryApp {

	public static void main(String[] args) {
		
		//Making a new Library object
		Library newLibrary = new Library();
		
		//Generated books to add to the Library
		Book book1 = new Book("Wheel of Time", "Robert Jordan", "12353235", 00.30);
		Book book2 = new Book("Spice and Wolf Anniversary Collectors edition", "Isuna Hasekura", "123456789", 175.00);
		Book book3 = new Book("Kitty and the Midnight Hour", "Carrie Vaughn", "1234567893", 7.99);

		System.out.println("Adding Books" + "\n");
		//Adding Books to the Library
		newLibrary.addBook(book1);
		newLibrary.addBook(book2);
		newLibrary.addBook(book3);

		
		//Made a reference variable called find book to search the ISBN
		Book findBook = newLibrary.searchByISBN("123456789");
		//A if else to see if the ISBN is in the Library object
		if (findBook != null) {
			System.out.println("Looking for book with ISBN: "  +findBook.getISBN());
			System.out.println("Book found: " + findBook + "\n");
		}
		else {
			System.out.println("Book not found" + "\n");
		}
		
		System.out.println("Displaying all books in Library" + "\n");
		newLibrary.displayBooks();
		System.out.println("\n");
		
		//running the remove then display then remove again
		newLibrary.removeBook(book3);
		System.out.println("\n");
		
		newLibrary.displayBooks();
		System.out.println("\n");
		
		newLibrary.removeBook(book3);
	}

}
