package Assignment;
//Write a Java program to find fibonacci series of n numbers.
//Assignment 1.4
import java.util.*;
public class fibonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        Integer n = sc.nextInt();
        int ft = 0, st = 1; //ft = First Term st = Second Term
        System.out.println("Fibonacci Series of "+n+" terms : ");
        for (int i = 1; i <= n; ++i) {
            System.out.println(ft);
            int nt = ft + st;   //nt = Next Term
            ft = st;
            st = nt;
        }
    }
}
