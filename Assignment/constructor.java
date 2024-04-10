package Assignment;
//Write a Jave Program to illustrate parameterized constructor
// Assignment 2.2
public class constructor {
    int id; 
    String name;
    constructor(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        constructor con1 = new constructor(201, "Parameterized Constructor 1");
        constructor con2 = new constructor(202, "Parameterized Constructor 2");

        con1.display();
        con2.display();
    }
}
