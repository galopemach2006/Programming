import java.util.Scanner;

public class mainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalEntity room101[] = new HospitalEntity[2];

        for (int i = 0; i < room101.length; i++) {
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Heartrate: ");
            int heart = sc.nextInt();
            System.out.print("Enter Oxygen Pressure: ");
            Integer OP = sc.nextInt();
            System.out.print("Enter Status: ");
            Health_Status h = Health_Status.stats(sc.nextInt());

            if (i == 0) {
                room101[i] = new Patient(id, h, name, heart);
            }
            else {
                room101[i] = new Ventilator(id, h, name, OP);
            }      
        }
        
        for(HospitalEntity i: room101) {
            System.out.println(i.getDetails());
        }
        sc.close();
    }
}
