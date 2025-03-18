package bai02_cau05;

public class SpecialEditionBook extends BookDecorator {
    private String specialFeature;

    public SpecialEditionBook(Book book, String specialFeature) {
        super(book);
        this.specialFeature = specialFeature;
    }

    public void showSpecialFeature() {
        System.out.println("Special Edition Feature: " + specialFeature);
    }
}
