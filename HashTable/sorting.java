package HashTable;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
        hm.put(05, "Ramesh");
        hm.put(10, "Sunaina");
        hm.put(42, "Sudha");
        hm.put(01, "Ram");
        hm.put(02, "Syam");
        hm.put(03, "Hari");

        TreeMap<Integer, String> tm = new TreeMap<Integer,String>(hm);

        Set<Integer> keys = tm.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) { 
            Integer i = itr.next(); 
            System.out.println(i + " " + tm.get(i)); 
        } 
    }
}
