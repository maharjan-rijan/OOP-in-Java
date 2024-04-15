package Inheritance;
import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you ?");
        System.out.println("Enter 1 for Job and 2 for part time programmer: ");
        choice = sc.nextInt();
        if (choice == 1){
            FullTime ft = new FullTime();
            int sal = ft.calculateSalary();
           System.out.println("Your Salary is: "+sal);
        } else {
            PartTime ft = new PartTime();
            int sal = ft.calculateSalary();
           System.out.println("Your Salary is: "+sal);
        }
       
    }
}
