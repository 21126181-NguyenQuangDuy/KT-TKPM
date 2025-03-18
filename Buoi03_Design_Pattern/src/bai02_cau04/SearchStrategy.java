package bai02_cau04;

import java.util.List;

public interface SearchStrategy {
	List<Book> search(List<Book> books, String query);
}
