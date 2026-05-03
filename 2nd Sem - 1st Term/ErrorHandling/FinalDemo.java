package ErrorHandling;
final class finalClass {
    public void msg() {
        System.out.println("Final Class");
    }
} 

class Constants {
    public static final int Days_in_a_Week = 7;
    private final int studentID;

    public Constants(int id) {
        this.studentID = id;
    }

    final void getDetails() {
        System.out.println("ID: " + studentID);
    }
}

public class FinalDemo {
    public static void main(String [] args) {
        Constants c = new Constants(758457);
        c.getDetails();
    }
}