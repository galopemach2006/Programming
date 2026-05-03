package Lab_Module_8_Galope;
import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
    
        m.put("One", "Uno");
        m.put("Two", "Dos");
        m.put("Three", "Tres");
        System.out.println("Original Values: " + m);
        m.put("Three", "Teen");
        System.out.println("Updated Values" + m);
        Set<String> s = m.keySet();
        Collection<String> c = m.values();
        System.out.println("Keys: " + s);
        System.out.println("Values: " + c);
        System.out.println("Entries: " + m.entrySet());     
    }
}
