package PracticeMachineProblem.PaymentMethodProgram;
import java.util.Scanner;

public class mainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many transactions?: ");
        int transactions = sc.nextInt();
        sc.nextLine();
        
        PaymentMethod p [] = new PaymentMethod[transactions];
        
        for (int i = 0; i < p.length; i++) {
            System.out.print("Pick a payment method (Credit, Paypal, or Bank Transfer): ");
            String method = sc.nextLine();

            System.out.print("Enter Amount: ");
            double a = sc.nextDouble();
            System.out.print("Enter Transaction ID: ");
            int t = sc.nextInt();
            sc.nextLine();

            p[i] = null;

            if (method.equalsIgnoreCase("Credit")) {
                System.out.print("Credit Card Number: ");
                String c_num = sc.nextLine();
                p[i] = new CreditCardPayment(a, t, c_num);
            } else if (method.equalsIgnoreCase("Paypal")) {
                System.out.print("Enter Email: ");
                String e = sc.nextLine();
                p[i] = new PaypalPayment(a, t, e); 
            } else if (method.equalsIgnoreCase("Bank Transfer")) {
                System.out.println("Enter Bank Account Number: ");
                String b = sc.nextLine();
                p[i] = new BankTransferPayment(a, t, b);
            }
        } 
        for (PaymentMethod e: p) {
            System.out.println();
            e.processPayment();
        }
        sc.close();
    }
}
