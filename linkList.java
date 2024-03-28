import java.util.*;
public class linkList {
    public static void main(String[] args) {
        LinkedList<String> st = new LinkedList<String>();
        st.add("Rajan");
        st.add("Sita");
        st.add("Roshani");
        st.add("Rojan");
        Iterator<String> itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        }
}
