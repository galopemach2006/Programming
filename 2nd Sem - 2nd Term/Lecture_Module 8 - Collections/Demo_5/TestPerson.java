package Demo_5;

/*
	The application/use of Generics Framework and Diamond Operator.
	The Generics Framework or Diamond Operator will eliminate the compilation warning.
*/
import java.util.*;
public class TestPerson{
	public static void main(String [] args){
		int sum = 0;

		Person p1 = new Person("Chris", 20);
		Person p2 = new Person("Alex", 22);
		Person p3 = new Person("Grace", 24);
		Person p4 = new Person("Arne", 26);
		Person p5 = new Person("Salve", 28);
		Person p6 = new Person("Khris", 30);
		Person p7 = new Person("Ken", 32);


		//Set <Person> myGroup = new HashSet<Person>();		// Generic Framework version
		Set <Person> myGroup = new HashSet<>();				// Diamond Operator version

		myGroup.add(p1);
		myGroup.add(p2);
		myGroup.add(p3);
		myGroup.add(p4);
		myGroup.add(p5);
		myGroup.add(p6);
		myGroup.add(p7);
		//myGroup.add(100); //error!
		//myGroup.add("This is not a Person object.");		// Error!

		//System.out.println(myGroup);

		/*
		Iterator iter = myGroup.iterator();

		while(iter.hasNext()){
			//System.out.println(iter.next());
			Person p = (Person) iter.next();
			System.out.println(p);

			sum += p.getAge();
		}
		*/

		//A version with The Generics Frameworl

		Iterator <Person> iter = myGroup.iterator();

		/*
		while(iter.hasNext()){
			//System.out.println(iter.next());
			Person p = iter.next();
			System.out.println(p);

			sum += p.getAge();
		}
		*/
		
		
		//Using enhanced For...Loop
		for(Person p : myGroup){
			System.out.println(p);
			sum += p.getAge();
		}
		
		
		
		

		System.out.println("Sum of age: " + sum);

		double aveAge = (double) sum / myGroup.size();
		System.out.println("Average age: " + aveAge);

	}	
}