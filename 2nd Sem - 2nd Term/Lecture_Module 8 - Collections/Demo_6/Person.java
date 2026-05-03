package Demo_6;

public class Person extends Object implements Comparable<Person>{
	//instance variables
	private String name;
	private int age;

	//constructors
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//getters
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}


	//Override toString()
	public String toString(){
		return getName() + ", at age " + getAge();
	}

	//Override equals()
	public boolean equals(Object obj){
		boolean temp = false;

		Person p = (Person) obj;
		if(obj != null && obj instanceof Person){
			if(this.getName().equals(p.getName()) && this.getAge() == p.getAge()){
				temp = true;
			}
		}

		return temp;
	}

	//Override hashCode()

	public int hashCode(){
		return getName().hashCode() ^ getAge();
	}
	
	//Override compareTo()
	
	
	//Compare names... Sort in Ascending Order
	public int compareTo(Person per){
		int result = this.getName().compareTo(per.getName());
		if(result > 0)
			result = 1;
		else if(result < 0)
			result = -1;

		return result;

	}
	

	/*
	//Compare names... Sort in Descending Order: Change the implementation or the signs in the result.
	public int compareTo(Person per){
		int result = this.getName().compareTo(per.getName());
		if(result > 0)
			result = -1;
		else if(result < 0)
			result = 1;

		return result;

	}
	*/
	/*
	//Compare age... Sort in Ascending Order
	public int compareTo(Person per){
		int result = this.getAge() - per.getAge();
		if(result > 0)
			result = 1;
		else if(result < 0)
			result = -1;

		return result;

	}
	*/
	

}