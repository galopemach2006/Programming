package ErrorHandling;
import java.util.Scanner;

public class BasicExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String num = sc.next();

        try {
            System.out.println("Attempting to Parse: " + num);
            Integer.parseInt(num);
        }
        catch (NumberFormatException e) {
            System.err.println("Not a Valid Input: " + num);
        }
        finally {
            System.out.println("Clean up Complete");
        }
        sc.close();
    }
}
