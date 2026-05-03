package ErrorHandling;
public class MultiCatchAndStackDemo {
    public static int triggerException() {
            int result = 10/0;
            return result;
    }
    public static void main(String[] args) {
        try{
            triggerException();
        }

        catch (ArithmeticException|NullPointerException e) {
            System.err.println("Caught an exception in main: " + e.getClass().getSimpleName());
        }   
    }
    
}
