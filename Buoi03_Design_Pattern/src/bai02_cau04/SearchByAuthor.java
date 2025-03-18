package bai02_cau04;

import java.util.ArrayList;
import java.util.List;

public class SearchByAuthor implements SearchStrategy {
    public List<Book> search(List<Book> books, String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }
}
