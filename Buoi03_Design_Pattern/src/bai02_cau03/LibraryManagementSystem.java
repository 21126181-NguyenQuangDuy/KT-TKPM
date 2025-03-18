package bai02_cau03;

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
        
        BookSearcher searcher = new BookSearcher();
        
        searcher.setStrategy(new SearchByTitle());
        System.out.println("Search by Title: " + searcher.searchBooks(library.getBooks(), "1984"));
        
        searcher.setStrategy(new SearchByAuthor());
        System.out.println("Search by Author: " + searcher.searchBooks(library.getBooks(), "Michelle Obama"));
        
        searcher.setStrategy(new SearchByGenre());
        System.out.println("Search by Genre: " + searcher.searchBooks(library.getBooks(), "Fiction"));
    }
}
