package Assignment.Inheritance;

public class Office extends Worker {
    int Salary = 300000;
    public static void main(String[] args) {
        Office O = new Office();
        System.out.println("Worker Post is: "+O.Post);
        System.out.println("Salary of Worker is: "+O.Salary);
    }
}
