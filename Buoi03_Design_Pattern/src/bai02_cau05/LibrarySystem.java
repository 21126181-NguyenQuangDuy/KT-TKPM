package bai02_cau05;

public class LibrarySystem {
	public static void main(String[] args) {
        Library library = Library.getInstance();
        LibraryUser user1 = new LibraryUser("Alice");
        library.addObserver(user1);
        
        Book book1 = BookFactory.createBook("printed", "Design Patterns", "GoF", "Software");
        library.addBook(book1);
        
        library.listAvailableBooks();
    }
}
