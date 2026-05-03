package MP2;

import java.util.Scanner;
import static java.lang.System.out;

public class mainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter Number of Students to Enroll: ");
        int students = sc.nextInt();

        Student s[] = new Student[students];

        for (int i = 0; i < s.length; i++) {
            out.println("--- Processing Entry #" + (i + 1) + " ---");
            out.print("Student Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            out.print("Course: ");
            String course = sc.nextLine();
            out.print("Student ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            out.print("Year Level (1:FRESHMAN, 2:SOPHOMORE, 3:JUNIOR, 4:SENIOR): ");
            YearLevel year = YearLevel.y(sc.nextInt());    
            out.print("Base Tuition Fee: ");
            int t = sc.nextInt();
            sc.nextLine();

            int grades[] = new int[3];
            for (int j = 0; j < grades.length; j++) {
                out.print("Enter Grade #" + (j + 1) + ": ");
                grades[j] = sc.nextInt();
            }   
            sc.nextLine();
            out.print("Enroll as Scholar?: ");
                String scholar = sc.nextLine();
                String stats = null;
                if (scholar.equalsIgnoreCase("Yes")) {
                    out.print("Enter Scholarhip Discount: ");
                    double discount = sc.nextDouble();
                    stats = "Scholar";
                    s[i] = new ScholarStudent(id, t, year, name, course, discount, grades, scholar);
                } else {
                    stats = "Regular";
                    s[i] = new RegularStudent(id, t, year, name, course, grades, stats);
            }
            System.out.println();
        }
        System.out.println("--- OFFICIAL ENROLLMENT REPORT ---");
        for (Student stud : s) {
            System.out.println();
            out.print(stud.displayInfo());
        } 
        sc.close();
    }
}