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
			System.out.println("Book added");
			return true;
		}
		System.out.println("Too many books, there is a limit of 5 books");
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
				System.out.println("Succesfully removed the book");
				return true;
			}
		}
		System.out.println("Failed to remove book");
		return false;
	}
	
	//Function to search the book array for a specific ISBN using the getter function.
	//Returns the book if found and null if not found.
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < count; i++) {
			if(books[i].getISBN().equals(ISBN))
				System.out.println("Book found" + ISBN);
				return books[i];
		}
		System.out.println("Book was not found for: " + ISBN);
		return null;
	}
		
	//Cycles through the books array and prints the information
	public void displayBooks() {
		for(int i = 0; i < count; i++) {
			System.out.println(books[i]);
		}
	}

}
