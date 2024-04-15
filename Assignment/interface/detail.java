package Assignment.Interface;

public class detail implements Government, LocalLevel {
    public void govt()
    {
        System.out.println("Government of Nepal");
    }

    public void local()
    {
        System.out.println("Government of Nepal");
    }
    public static void main(String[] args) {
        detail obj = new detail();
        obj.govt();
        obj.local();
    } 
}
