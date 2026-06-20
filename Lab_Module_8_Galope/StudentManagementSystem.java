package Lab_Module_8_Galope;

import java.io.*;
import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> credentials = new HashMap<>();
        
        File userFile = new File("userlist.txt");
        File studentFile = new File("students.txt");
        File gradeFile = new File("grades.txt");

        // 1. Load User Credentials
        try (BufferedReader br = new BufferedReader(new FileReader(userFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] contents = line.split(",");
                if (contents.length >= 2) {
                    credentials.put(contents[0].trim(), contents[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading user list: " + e.getMessage());
            return;
        }


        // 2. Authentication
        System.out.print("Enter Username: ");
        String username = sc.nextLine().trim();
        System.out.print("Enter Password: ");
        String password = sc.nextLine().trim();

        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            System.out.println("\nAuthentication successful! Welcome, " + username + ".");
            printFileDetails(userFile);

            // 3. Process Students and Grades
            try (BufferedReader br2 = new BufferedReader(new FileReader(studentFile));
                 PrintWriter pr = new PrintWriter(new FileWriter(gradeFile))) {

                System.out.printf("%-10s | %-15s | %-6s | %-5s%n", "ID", "Name", "Score", "Grade");
                System.out.println("----------------------------------------------------------");

                String line;
                while ((line = br2.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data.length >= 3) {
                        String id = data[0].trim();
                        String name = data[1].trim();
                        int score = Integer.parseInt(data[2].trim());
                        String grade = calculateGrade(score);

                        // Display to Console
                        System.out.printf("%-10s | %-15s | %-6s | %-5s%n", id, name, score, grade);
                        
                        // Save to grades.txt
                        pr.println(id + "," + name + "," + score + "," + grade);
                    }
                }
                System.out.println("\nGrades have been successfully saved to " + gradeFile.getName());

            } catch (IOException e) {
                System.out.println("Error processing student data: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid Login, Try Again.");
        }
        sc.close();
    }

    // Helper to calculate letter grade
    private static String calculateGrade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    // Helper to print file metadata
    private static void printFileDetails(File file) {
        System.out.println("File Name: " + file.getName());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + new Date(file.lastModified()));
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println();
    }
}