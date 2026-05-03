package EnhancedLibraryRentalSystem;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Library Items: ");
        int num = sc.nextInt();
        
        LibraryItem items [] = new LibraryItem[num];

        for (int i = 0; i < items.length; i++) {
            System.out.println("Book, DVD, or Magazine: ");
            String item = sc.next();

            System.out.println("Title: ");
            String title = sc.next();
            System.out.println("Item ID: ");
            int id = sc.nextInt();

            if (item.equalsIgnoreCase("Book")) {
                    System.out.println("Author: ");
                    String author = sc.next();
                    sc.nextLine();
                    System.out.println("Number of Pages: ");
                    int pages = sc.nextInt();
                    items[i] = new Book(title, id, false, author, pages);
                
            } else if (item.equalsIgnoreCase("DVD")) {
                    System.out.println("Number of Duration: ");
                    int duration = sc.nextInt();
                    System.out.println("Type of Genre: ");
                    String genre = sc.next();
                    items[i] = new DVD(title, id, false, duration, genre);
            } else {
                    System.out.println("Issue Number: ");
                    int issueNumber = sc.nextInt();
                    System.out.println("Publisher: ");
                    String publisher = sc.next();
                    items[i] = new Magazine(title, id, false, issueNumber, publisher);
            }
        }
                for (LibraryItem e: items) {
                        if(e.borrowedItem() == true) {
                                System.out.println();
                                System.out.println(e.getDetails());
                        } else if (e.borrowedItem()) {
                                System.out.println("This has been borrowed");
                        }
                
    }
    sc.close();
}
}

