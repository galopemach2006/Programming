package PracticeMachineProblem.MachineProblem1;

import java.util.Scanner;
public class mainMethod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int num = sc.nextInt();

        Student[] students = new Student[num];
    
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter Name: ");
            String name = sc.next();
            sc.nextLine();
            int grades [] = new int[3];
            for (int j = 0; j < grades.length; j++) {
                System.out.print("Enter Grades: ");
                grades[j] =  sc.nextInt();      
            }  
            Student temporary = new Student(name, grades);
            if (temporary.getAverage() > 85) {
                students[i] = new HonorStudent(name, grades, "With Honors");
            } else {
                students[i] = temporary;
            }
            for (int g: grades) {
                System.out.println(g);
        }
        }
        for (Student e: students) {
            System.out.println();
            System.out.println(e.displayInfo());
            System.out.println("Average: " + e.getAverage());
        }
        sc.close();
    } 
}
