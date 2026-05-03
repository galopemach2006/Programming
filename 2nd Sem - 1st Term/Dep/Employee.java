package Dep;

public class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getDetails(){
		return "Name: " + name + "\nSalary: " + salary;
	} 
}

