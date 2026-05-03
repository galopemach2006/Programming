// uses or overrides a deprecated API.
import java.util.*;
public class SetExample{
	public static void main(String [] args){
		Set <Object> set = new HashSet<>();

		set.add("Chris");
		//set.add(new Integer(100));
		//set.add(new Boolean(true));
		set.add(100);
		set.add(true);
		set.add("Java");
		set.add("java");
		set.add("Java");
		set.add("Chris");
		//set.add(new Double(2.5));
		set.add(2.5);
		set.add("Java");
		set.add("chris");
		set.add("Thopp");

		System.out.println(set);
	}
}