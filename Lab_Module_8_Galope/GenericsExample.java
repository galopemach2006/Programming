package Lab_Module_8_Galope;

import java.util.*;
public class GenericsExample {
    public static void main(String[] args) {
        List<Integer> myInteger = new ArrayList<>();
        myInteger.add(0, 100);
        myInteger.add(1, 200);
        System.out.println(myInteger);
        /*for (Integer i: myInteger) {
            System.out.println("The number is: " + i);
        }
            */
        
        List<String> myString = new ArrayList<>();
        myString.add("Mach");
        myString.add("Galope");
        System.out.println(myString);
        /* 
        for (String s: myString) {
            System.out.println("Name: " + s);
        }
            */
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Mach");
        employees.put(2, "Galope");
        System.out.println(employees);
    }
}
