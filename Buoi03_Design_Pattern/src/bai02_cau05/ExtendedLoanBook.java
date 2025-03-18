package bai02_cau05;

public class ExtendedLoanBook extends BookDecorator {
    public ExtendedLoanBook(Book book) {
        super(book);
    }

    public void extendLoanPeriod() {
        System.out.println("Loan period extended for: " + decoratedBook.getTitle());
    }
}
