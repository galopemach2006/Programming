package PracticeMachineProblem.AnotherOne;
import java.util.Scanner;

public class mainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many fares to calculate?: ");
        int n = sc.nextInt();
        sc.nextLine();
        FareCalculation fares[]= new FareCalculation[n];
        for (int i = 0; i < fares.length; i++) {
            System.out.println("Pick a Vehicle (Bus, Taxi, or Train): ");
            String v = sc.next();
            if (v.equalsIgnoreCase("taxi")) {
                double values[] = new double[5];
                System.out.println("Enter (Base Fare, Distance, Rate, Waiting Time, Waiting Rate):");
                for (int j = 0; j < values.length; j++) {
                    System.out.print("Number " + (j + 1) + ": ");
                    values[j] = sc.nextDouble();
                }
                fares[i] = new taxiCalculation(values[0], values[1], values[2], values[3], values[4]);
            } else if (v.equalsIgnoreCase("bus")) {
                
            }
        }

        for (FareCalculation f: fares) {
            if (f != null) {
                 System.out.println(f.fareCalculation());
            }
        }  
        sc.close();  
    }
}
