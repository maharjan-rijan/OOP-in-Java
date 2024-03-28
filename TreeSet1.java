import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();
        al.add("Rajan");
        al.add("Ajay");
        al.add("Sanjay");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
