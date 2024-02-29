package Encapsulation;

public class Run {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.setName("Rijan Maharjan");
        obj.setAge(20);

        System.out.println("Name: "+obj.getName()+" "+"Age: "+obj.getAge());
    }
}
