package bai02_cau05;

public abstract class BookDecorator extends Book {
    protected Book decoratedBook;

    public BookDecorator(Book book) {
        super(book.getTitle(), book.getAuthor(), book.getGenre());
        this.decoratedBook = book;
    }

    @Override
    public void borrowBook() {
        decoratedBook.borrowBook();
    }

    @Override
    public void returnBook() {
        decoratedBook.returnBook();
    }

}
