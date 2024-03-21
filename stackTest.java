import java.util.*;

public class stackTest {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("Apple");
        st.push("Banana");
        st.push("Orange");

        String e = st.peek();
        System.out.println(e);
        System.out.println(st);
    }
}
