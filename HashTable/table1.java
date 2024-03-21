package HashTable;
import java.util.*;
public class table1 {
    public static void main(String[] args) {
        // Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
        Hashtable<String, Integer> hm = new Hashtable<String,Integer>();
        // hm.put(233, "Ram");
        // hm.put(2334, "Syam");
        hm.put("Saren", 23);
        hm.put("Karan", 334);
// Remove 
        hm.remove("Saren");
        Enumeration<String> keys = hm.keys();
        // Print Keys
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(hm.get(key));

        }
        // Print Keys and Values
        // for(Map.Entry m:hm.entrySet()){
        //     System.out.println(m.getKey()+ " "+m.getValue());
        // }
    }
}
