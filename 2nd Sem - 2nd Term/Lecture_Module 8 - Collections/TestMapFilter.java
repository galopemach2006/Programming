import java.util.*;
public class TestMapFilter{
	public static void main(String [] args){

		Map<Integer, String> employees = new HashMap<>();

		employees.put(35, "Peter");
		employees.put(29, "Mark");
		employees.put(43, "Luke");
		employees.put(31, "John");
		employees.put(25, "James");

		//filtering by key
		Map<Integer, String> lhm = new LinkedHashMap<>();

		for(Map.Entry<Integer, String> employee : employees.entrySet()){
			if(employee.getKey() > 30){
				lhm.put(employee.getKey(), employee.getValue());
			}
		}

		System.out.println("Filtered Map: " + lhm);

		
		//filtering by value
		Map<Integer, String> employeeOfTheMonth = new LinkedHashMap<>();

		for(Map.Entry<Integer, String> employee : employees.entrySet()){
			if(employee.getValue().equals("John")){
				employeeOfTheMonth.put(employee.getKey(), employee.getValue());
			}
		}

		System.out.println("Employee of the Month: " + employeeOfTheMonth);
		
	}
}