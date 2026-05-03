package PracticeMachineProblem.PaymentMethodProgram;

public class CreditCardPayment extends PaymentMethod {
    protected String cardNumber = null;

    public CreditCardPayment(double amount, int transactionID, String cardNumber) {
        super(amount, transactionID);
        this.cardNumber = cardNumber;
    }

    public double calculateFee() {
        double discount = getAmount() * 0.03;
        return discount;
    }

    public void cNumber() throws InvalidCreditCardException{
        if (cardNumber.length() != 16) {
            throw new InvalidCreditCardException("Error: Not a Valid Credit Number");
        }
        System.out.println("Card Number: " + cardNumber);
    }

    public void processPayment() {
        try {
            cNumber();
            System.out.println("Fee: " + calculateFee() + "\nAmount: " + getAmount() + "\nTransaction ID: " + getTransactionID()); 
        } catch (InvalidCreditCardException e) {
            System.out.println(e.getMessage());
        }
       
    }


}