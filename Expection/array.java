package Expection;

public class array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        try {
            System.out.println(a[8]);
        } 
        catch (Exception e) {
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Program Complete");
        }
    }
    
}
