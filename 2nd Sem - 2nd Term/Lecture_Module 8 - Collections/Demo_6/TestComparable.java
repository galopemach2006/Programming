package Demo_6;

public class TestComparable{
	public static void main(String [] args){
		System.out.println("alpha".compareTo("bravo"));		// negative value
		System.out.println("bravo".compareTo("bravo"));		// 0
		System.out.println("delta".compareTo("bravo"));	// positive value
	}
}