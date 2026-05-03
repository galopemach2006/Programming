package EnhancedLibraryRentalSystem;

public class Magazine extends LibraryItem{
    private int issueNumber;
    private String publisher;

    public Magazine(String title, int itemID, boolean isBorrowed, int issueNumber, String publisher) {
        super(title, itemID, isBorrowed);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    int calculateLateFee() {
        return calculateLateFee(5);
    }

    @Override
    String getDetails() {
        return super.getDetails() + "\nIssue Number: " + issueNumber + "\nPublisher: " + publisher;
    }
}
