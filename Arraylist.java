

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ram");
        al.add("Syam");
        al.add("Hari");
        al.add("Binit");
        al.add("Samir");
        System.out.println("Array List Before Sorting : " +al);

        Collections.sort(al);
        System.out.println("Array List After Sorting in Ascending");
        System.out.println(al);

        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Array List After Sorting in Descending");
        System.out.println(al);

    }
}
