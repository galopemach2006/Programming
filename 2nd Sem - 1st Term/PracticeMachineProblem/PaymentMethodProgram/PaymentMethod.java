package PracticeMachineProblem.PaymentMethodProgram;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidCreditCardException extends Exception {
    public InvalidCreditCardException(String message) {
        super(message);
    }
}

class InvalidBankAccountException extends Exception {
    public InvalidBankAccountException(String message) {
        super(message);
    } 
}

public abstract class PaymentMethod{
    protected double amount;
    protected int transactionID;

    public PaymentMethod(double amount, int transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
    }

    public abstract void processPayment();
    public abstract double calculateFee();
    public double getAmount() {
        return amount;
    }

    public int getTransactionID() {
        return transactionID;
    }
}
