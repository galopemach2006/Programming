package EnhancedLibraryRentalSystem;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, int itemId, boolean isBorrowed, String author, int pages) {
        super(title, itemId, isBorrowed);
        this.author = author;
        this.pages = pages;
    }

    int calculateLateFee() {
        return calculateLateFee(10);
    }

    @Override
    String getDetails() {
        return super.getDetails() + "\nAuthor: " + author + "\nPages: " + pages;
    }

}
