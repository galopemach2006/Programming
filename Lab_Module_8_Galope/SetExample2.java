package Lab_Module_8_Galope;
import java.util.*;
public class SetExample2 {
    public static void main(String[] args) {
        Set<Object> s = new HashSet<>();
        s.add("Mach");
        s.add("Galope");
        s.add(19);
        s.add(true);
        s.add("Mach");

        System.out.println(s);
        /* 
        int counter = 0;
        for (Object c : s) {
            System.out.println("Data " + (counter+1)  + ": " + c);
            counter++;
        }
            */
    }
}
