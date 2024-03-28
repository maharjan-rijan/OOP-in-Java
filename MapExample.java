import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100, "Ajay");
        map.put(123,"Sanjy");
        map.put(223, "Rahul");

        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+ " " +m.getValue());
        }
    }
}
