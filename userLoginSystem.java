import java.io.*;
import java.util.*;

public class userLoginSystem {
    public static void main(String[] args) throws IOException{    
        File f = new File(args[0]);
        File f2 = new File(args[1]);
        BufferedReader br = new BufferedReader(new FileReader(f));
        PrintWriter pr = new PrintWriter(new FileWriter(f2, true));
        Map<String, String> l = new HashMap<>(); 

        String contents;

        while((contents = br.readLine()) != null) {
            String[] c = contents.split(",");
            String username = c[0].trim();
            String password = c[1].trim();

            l.put(username, password);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String u = sc.nextLine().trim();
        System.out.print("Password: ");
        String p = sc.nextLine().trim();

        if (l.containsKey(u)  && l.get(u).equals(p)) {
            System.out.print("Login Successful");
            pr.println("Right Credentials - " + u + ": " + p);
        } else {
            System.out.print("Login Unsuccessful");
            pr.println("Wrong Credentials - " + u + ": " + p);
        }
        pr.close();
        br.close();
        sc.close();
    }
}

