package bai02_cau02;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        Library library = Library.getInstance();
        
        Book book1 = BookFactory.createBook("printed", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Book book2 = BookFactory.createBook("ebook", "1984", "George Orwell", "Dystopian");
        Book book3 = BookFactory.createBook("audiobook", "Becoming", "Michelle Obama", "Biography");
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        library.listAvailableBooks();
        
        Book bookToBorrow = library.findBookByTitle("1984");
        if (bookToBorrow != null) {
            bookToBorrow.borrowBook();
        }
        
        library.listAvailableBooks();
        
        bookToBorrow.returnBook();
        
        library.listAvailableBooks();
    }
}
