package Demo_4;

public class Person extends Object{
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

}