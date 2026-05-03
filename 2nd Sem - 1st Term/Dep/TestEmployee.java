package Dep;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Employee staff [] = new Employee[3];
		
		System.out.print("Enter Employee Name: ");
		String e_name = sc.nextLine();
		System.out.print("Enter Salary:");
		double e_salary = sc.nextDouble();
		staff[0] = new Employee(e_name, e_salary);

		sc.nextLine();		

		System.out.print("Enter Manager Name: ");
		String m_name = sc.nextLine();
		System.out.print("Enter Salary: ");
		double m_salary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Department: ");
		String m_department = sc.nextLine();
		staff[1] = new Manager(m_name, m_salary, m_department);
		
		
		System.out.print("Enter Director Name: ");
		String d_name = sc.nextLine();
		System.out.print("Enter Salary: ");
		double d_salary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Department: ");
		String d_department = sc.nextLine();
		System.out.print("Enter Car Allowance: ");
		double d_carAllowance = sc.nextDouble();
		
		staff[2] = new Director(d_name, d_salary, d_department, d_carAllowance);

		sc.nextLine();	

		System.out.println();
		System.out.print("Diplay Employee Details: ");
		for (Employee em: staff) {
			System.out.println();
			System.out.println(em.getDetails());
		}	 
		sc.close();
	}
}