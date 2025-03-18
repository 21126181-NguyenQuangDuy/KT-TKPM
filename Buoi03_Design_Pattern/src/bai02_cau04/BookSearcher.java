package bai02_cau04;

import java.util.List;

public class BookSearcher {
private SearchStrategy strategy;
    
    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }
    
    public List<Book> searchBooks(List<Book> books, String query) {
        if (strategy == null) {
            throw new IllegalStateException("Search strategy not set");
        }
        return strategy.search(books, query);
    }
}
