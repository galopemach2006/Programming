package PracticeMachineProblem.PaymentMethodProgram;

public class PaypalPayment extends PaymentMethod {
    protected String email;

    public PaypalPayment(double amount, int transactionID, String email) {
        super(amount, transactionID);
        this.email = email;
    }

    public double calculateFee() {
        double discount = getAmount() * 0.02;
        return discount;
    }

    public String getUserEmail() throws InvalidEmailException{
        if (email.contains("@")){
            return email;
        }
        throw new InvalidEmailException("Error: Not A Valid Email");
    }

    public void processPayment() {
        try {
            System.out.println("Fee: " + calculateFee() + "\nAmount: " + getAmount() + "\nEmail: " + getUserEmail() + "\nTransaction ID: " + getTransactionID());
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        
    }
}