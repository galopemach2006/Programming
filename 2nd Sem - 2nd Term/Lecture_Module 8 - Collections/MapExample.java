import java.util.*;
import java.util.Collection;
public class MapExample{
	public static void main(String [] args){
		Map <String, String> map = new HashMap<>();
		map.put("one", "uno");
		map.put("two", "dos");
		map.put("three", "dos");

		//Display the map
		System.out.println("Displaying the map.");
		System.out.println(map);

		
		// Overrites the previous assignment
		map.put("three","tres");
		map.put("four", "quatro");
		
		//Display the map
		System.out.println("Updated the map.");
		System.out.println(map);
		
		
		// Returns set view of keys
		System.out.println("\nDisplaying set1");
		Set<String> set1 = map.keySet();
		System.out.println(set1);
		
		
		// Returns Collection view of values
		System.out.println("\nDisplaying collection");
		Collection<String> collection = map.values();
		System.out.println(collection);
		
		
		//Returns set view of key value mapping
		System.out.println("\nDisplaying set2");
		Set set2 = map.entrySet();
		System.out.println(set2);
		
		System.out.println("\nDisplaying all set1, collection, and set2");
		System.out.println(set1 + "\n" + collection + "\n" + set2);
		
		
		

	}
	
}