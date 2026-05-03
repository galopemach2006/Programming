package EnhancedLibraryRentalSystem;

public class DVD extends LibraryItem{
    private int duration;
    private String genre;

    public DVD(String title, int itemID, boolean isBorrowed, int duration, String genre) {
        super(title, itemID, isBorrowed);
        this.duration = duration;
        this.genre = genre;
    }

    int calculateLateFee() {
        return calculateLateFee(15);
    }

    @Override
    String getDetails() {
        return super.getDetails() + "\nDuration: " + duration + "\nGenre" + genre;
    }
}
   

