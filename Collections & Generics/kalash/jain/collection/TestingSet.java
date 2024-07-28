package kalash.jain.collection;

import java.util.Set;
import java.util.HashSet;

public class TestingSet {
    public static void main(String[] args) {
       Set<String> names = new HashSet<>();
       
        System.out.println(names.add("kalash")); 
        System.out.println(names.add("jain")); 
        System.out.println(names.add("coding")); 

        Utility.print(names);
        
        System.out.println(names.add("kalash"));
        System.out.println(names.size());

        Utility.print(names);
        
        System.out.println(names.contains("kalash"));
        System.out.println(names.remove("kalash"));
        
        Utility.print(names);
        System.out.println(names.remove("kalash"));
    }
}