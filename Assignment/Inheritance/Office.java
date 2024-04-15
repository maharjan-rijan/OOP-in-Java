package Assignment.Inheritance;

public class Office extends Worker {
    int Salary = 300000;
    public static void main(String[] args) {
        Office obj = new Office();
        System.out.println("Worker Post is: "+obj.Post);
        System.out.println("Salary of Worker is: "+obj.Salary);
    }
}
