package Assignment;
//Write a Java program to calculate factorial of a given number
//Assignment 1.3
public class factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        int num = 5;
        for ( i = 1; i < num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of " + num + " is : "+ fact);
    }
}
