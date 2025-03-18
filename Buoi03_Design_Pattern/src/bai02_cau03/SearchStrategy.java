package bai02_cau03;

import java.util.List;

public interface SearchStrategy {
	List<Book> search(List<Book> books, String query);
}
