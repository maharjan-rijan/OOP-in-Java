import java.util.*;
public class fibonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        Integer n = sc.nextInt();
        int  ft = 0, st = 1;
        System.out.println("Fibonacci Series of " + n + " terms :");
        for (int i = 1; i <= n; ++i) {
            System.out.println(ft);
            int nt = ft + st; ft = st;
            st = nt;
        }
    }
}
