import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Module8_Galope { 
    public static void main(String[] args) throws IOException {   
        Map<String, String> m = new HashMap<>(); 
        File credentials = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(credentials)); 
        String line, passLine;

        while ((line = br.readLine()) != null && (passLine = br.readLine()) != null) {
            String[] user = line.split(":", 2);
            String username = user[1].trim();

            String[] pass = passLine.split(":", 2);
            String password = pass[1].trim();

            m.put(username, password);
            
        }
        String u, p;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        u = sc.nextLine().trim();
        System.out.print("Enter Password: ");
        p = sc.nextLine().trim();

        if (m.containsKey(u) && m.get(u).equals(p)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Unsuccessful");
        }
        sc.close();
        br.close();
    }
}