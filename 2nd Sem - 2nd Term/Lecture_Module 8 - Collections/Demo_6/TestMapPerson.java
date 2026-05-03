package Demo_6;

import java.util.*;
public class TestMapPerson{
	public static void main(String [] args){
		Person p1 = new Person("Chris", 20);
		Person p2 = new Person("Alex", 22);
		Person p3 = new Person("Grace", 24);
		Person p4 = new Person("Arne", 26);
		Person p5 = new Person("Salve", 28);
		Person p6 = new Person("Khris", 30);
		Person p7 = new Person("Ken", 32);

		Map<Integer, Person> employees = new TreeMap<>();

		//employees.put(new Integer(201),p1);					// replace with autoboxing 201 instead of newInteger(201) to remove the warning.
		employees.put(201,p1);
		employees.put(102,p2);
		employees.put(302,p3);
		employees.put(104,p4);
		employees.put(403,p5);
		employees.put(105,p6);
		employees.put(504,p7);

		//System.out.println(employees);

		for(Map.Entry<Integer, Person> employee : employees.entrySet()){
			System.out.println("EmployeeID: " + employee.getKey() + "\nEmployee Details: " + employee.getValue());
			System.out.println();
		}

	}
}