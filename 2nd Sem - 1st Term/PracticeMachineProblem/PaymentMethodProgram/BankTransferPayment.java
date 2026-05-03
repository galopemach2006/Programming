package PracticeMachineProblem.PaymentMethodProgram;

public class BankTransferPayment extends PaymentMethod{
    protected String bankAccount; 

    public BankTransferPayment(double amount, int transactionID, String bankAccount) {
        super(amount, transactionID);
        this.bankAccount = bankAccount;
    }

    public double calculateFee() {
        double discount = getAmount() + 50.0;
        return discount;
    }

    String bank() throws InvalidBankAccountException {
        if (bankAccount.length() != 4) {
            throw new InvalidBankAccountException("Error: Not a Valid Bank Account Number");
        }
        return bankAccount;
    }

    public void processPayment() {
        try {
            System.out.println("Fee: " + calculateFee() + "\nAmount: " + getAmount() + "\nBank Account Number: BDO" + bank() + "Transaction ID: " + getTransactionID());
        } catch (InvalidBankAccountException e) {
            System.out.println(e.getMessage());
        }
        
    }
        
    
}
