package Assignment;
//Write a Java program to print your name, rollNo and percentage entered by user.
// Assignment 1.2
import java.util.*;
public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Percentage: ");
        String percentage = sc.nextLine();
        System.out.println("Enter your RollNo: ");
        Integer number = sc.nextInt();
        System.out.println("Your name is : " + name);
        System.out.println("Your RollNo is : " +number);
        System.out.println("Your Percentage : " + percentage);
    }
}
