import java.io.*;

public class student_record { 
    public static void main(String[] args) throws IOException { 
        File input = new File(args[0]);
        File results = new File(args[1]);
        BufferedReader br = new BufferedReader(new FileReader(input));
        PrintWriter pr = new PrintWriter(new FileWriter(results, true));
        String contents;

        int sum = 0;
        double average = (double) 0;
        int count = 0;
        int highest_score = 0;
        String name_of_high = null, id_of_high = null;

        while((contents = br.readLine()) != null) {
            String[] files = contents.split(",");
            String id = files[0]; 
            String name = files[1];
            int grade = Integer.parseInt(files[2]);

            sum += grade;
            count++;

            if (grade > highest_score) {
                highest_score = grade;
                name_of_high = name;
                id_of_high = id;
            }
        }

        pr.println("ID: " + id_of_high);
        pr.println("Name: " + name_of_high);
        pr.println("Highest Score: " + highest_score);
        average = sum / count;
        pr.println("Average: " + average);
        
        br.close();
        pr.close();
    }
}
