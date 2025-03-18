package bai02_cau02;

public class BookFactory {
	public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "printed":
                return new PrintedBook(title, author, genre);
            case "ebook":
                return new EBook(title, author, genre);
            case "audiobook":
                return new AudioBook(title, author, genre);
            default:
                throw new IllegalArgumentException("Unknown book type: " + type);
        }
    }
}
