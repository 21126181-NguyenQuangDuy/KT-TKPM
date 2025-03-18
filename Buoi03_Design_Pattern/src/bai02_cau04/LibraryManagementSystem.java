package bai02_cau04;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        Library library = Library.getInstance();
        
        LibraryUser user1 = new LibraryUser("Alice");
        LibraryUser user2 = new LibraryUser("Bob");
        
        library.addObserver(user1);
        library.addObserver(user2);
        
        Book book1 = BookFactory.createBook("printed", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        library.addBook(book1);
        
        Book book2 = BookFactory.createBook("ebook", "1984", "George Orwell", "Dystopian");
        library.addBook(book2);
    }
}
