package bai02_cau03;

import java.util.ArrayList;
import java.util.List;

public class SearchByGenre implements SearchStrategy{
	public List<Book> search(List<Book> books, String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }
}
