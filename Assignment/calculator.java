package Assignment;
//Write a java program to display a simple calculator that performs ( +, -, * and /).
//Assignment 1.6
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        float Result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        Integer num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        Integer num2 = sc.nextInt();
        System.out.println("Chose any Operation :");
        String sys = sc.next();
        switch (sys) {
            case "+":
                Result = num1 + num2;
                System.out.println("The sum of given number : " + Result);
                break;

            case "-":
                Result = num1 - num2;
                System.out.println("The difference of given number : " + Result);
                break;
        
            case "*":
                Result = num1 * num2;
                System.out.println("The multiplication of given number : " + Result);
                break;

                case "/":
                Result = num1 / num2;
                System.out.println("The division of given number : " + Result);
                break;
            default:
            System.out.println("Invalid data");
                break;
        }
    }
}
