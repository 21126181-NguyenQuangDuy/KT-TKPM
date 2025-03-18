package bai02_cau01;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        Library library = Library.getInstance();
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Book book2 = new Book("1984", "George Orwell", "Dystopian");
        
        library.addBook(book1);
        library.addBook(book2);
        
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
