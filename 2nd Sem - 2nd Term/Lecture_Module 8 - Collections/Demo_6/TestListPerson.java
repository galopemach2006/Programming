package Demo_6;

import java.util.*;
public class TestListPerson{
	public static void main(String [] args){
		Person p1 = new Person("Chris", 20);
		Person p2 = new Person("Alex", 22);
		Person p3 = new Person("Grace", 24);
		Person p4 = new Person("Arne", 26);
		Person p5 = new Person("Salve", 28);
		Person p6 = new Person("Khris", 30);
		Person p7 = new Person("Ken", 32);

		List<Person> people = new ArrayList<>();

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		people.add(p7);

		Collections.sort(people);		//sorting in ascending order
		System.out.println("\nAscending order");
		for(Person p : people){
			System.out.println(p);
		}
		
		Collections.sort(people, Collections.reverseOrder());		//sorting in descending order
		System.out.println("\nDescending order");
		for(Person p : people){
			System.out.println(p);
		}
		

	}
}