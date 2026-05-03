package EnhancedLibraryRentalSystem;

public class LibraryItem {
    private String title;
    private int itemId;
    private boolean isBorrowed;

    LibraryItem(String title, int itemId, boolean isBorrowed) {
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = isBorrowed;
    }

    boolean borrowedItem() {
        isBorrowed = false;
        return isBorrowed;
    }

    String returnItem() {
        return "This book " + title + "(" + itemId + ")" + " is returned";
    }

    int calculateLateFee(int lateFee) {
        int sum = 0;
        sum += lateFee;
        return sum;
    }

    String getDetails() {
        return "Title: " + title + "\nItem ID: " + itemId; 
    }
}


