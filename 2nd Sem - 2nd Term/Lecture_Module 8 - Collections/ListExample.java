// uses or overrides a deprecated API.
import java.util.*;
public class ListExample{
	public static void main(String [] args){
		List<Object> list = new ArrayList<>();

		list.add("Chris");
		//list.add(new Integer(100));
		//list.add(new Boolean(true));
		list.add(100);
		list.add(true);
		list.add("Java");
		list.add("java");
		list.add("Java");
		list.add("Chris");
		//list.add(new Double(2.5));
		list.add(2.5);
		list.add("Java");
		list.add("chris");
		list.add("Thopp");

		System.out.println(list);
	}
}