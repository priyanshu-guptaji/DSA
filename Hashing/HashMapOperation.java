import java.util.HashMap;
import java.util.*;
public class HashMapOperation {
    public static void main(String args[]){
        //HashMap<String ,Integer> hm = new HashMap<>();
        // put(key,value)       O(1)
        // get(key)             O(1)
        // containskey(key)     O(1)
        // remove(key)          O(1)


         HashMap <String , Integer> hm =  new HashMap<>();

        // Add key-value pairs
        hm.put("India" , 100);
        hm.put("China" , 150);
        hm.put("US" , 50);

        // Print the whole map
        System.out.println(hm);

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println("");

        //size
        System.out.println(hm.size());

        //IsEmpty
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
