import java.util.*;

public class stackTest {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("Apple");
        st.push("Banana");
        st.push("Orange");

        System.out.println("Items in the Stack:");
        displayStackItems(st);
    }

    public static void displayStackItems(Stack<String> st) {
        for (String item : st) {
            System.out.println(item);
        }
    }
}
