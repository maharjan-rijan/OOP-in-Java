package Constructors;
//Parameterized Constructor
public class Student {
    int id; 
    String name;
    Student(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Student std1 = new Student(2004, "Rijan Maharjan");
        Student std2 = new Student(2005, "Sunaina Maharjan");

        std1.display();
        std2.display();
    }
}
