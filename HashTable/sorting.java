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

        System.out.println("Ascending Order:");
        sortByKeyAscending(hm);
        System.out.println();

        System.out.println("Descending Order:");
        sortByKeyDescending(hm);
        System.out.println();
    }
    public static void sortByKeyAscending(Hashtable<Integer, String> hm){
        List<Map.Entry<Integer, String>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getKey));
        for(Map.Entry<Integer, String> entry :list){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void sortByKeyDescending(Hashtable<Integer, String> hm) {
        List<Map.Entry<Integer, String>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
}
}
