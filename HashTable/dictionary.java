package HashTable;
import java.util.*;
public class dictionary {
    public static void main(String[] args){
        //Create Dictionary
        Dictionary di = new Hashtable<>();
        // adding value
        di.put(101, "Kathmandu");
        di.put(102, "Pokhara");
        di.put(103, "Biratnagar");
        di.put(104, "Butwal");
        di.put(105, "Janakpur");
        System.out.println(di);
    }
}
