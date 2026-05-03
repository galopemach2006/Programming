import java.io.*;

public class Module7_Galope { 
    public static void main(String[] args) throws IOException {    
        File credentials = new File(args[0]);
        File username = new File(args[1]);
        File password = new File(args[2]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new FileWriter(credentials, true)); 
        PrintWriter pr1 = new PrintWriter(new FileWriter(username, true)); 
        PrintWriter pr2 = new PrintWriter(new FileWriter(password, true)); 
        String str = br.readLine();

        for (int i = 1; str != null; ++i) {
            if (i % 2 == 1) {
                pr.println("Username " + i + ": " + str.trim());
                pr1.println("Username " + i + ": " + str.trim());
                str = br.readLine();
            } else {
                pr.println("Password " + i + ": " + str.trim());
                pr2.println("Password " + i + ": " + str.trim());
                str = br.readLine();
            }
        }
        br.close();
        pr.close();
        pr1.close();
        pr2.close();
    }
}