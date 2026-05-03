package ErrorHandling;
class InvalidAgeException extends Exception {
    public InvalidAgeException (String message){
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws InvalidAgeException {
            if (age<18) {
                throw new InvalidAgeException("Age must be 18 and above to register");
            } 
    }
    public static void main(String[] args) {
       
        try {
            checkAge(15);
        }

        catch (InvalidAgeException e) {
            System.out.println("Error Caught: " + e.getClass());
        }  
}
}
