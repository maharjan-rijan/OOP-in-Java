package Expection;
public class Expection {
    public static void main(String[] args) {
        int a = 5; 
        int b = 0; 
        int result;
        try{
            result = a/b;
            System.out.println(result);
        } catch(Exception ae){
            System.out.println(ae.toString());
            // System.out.println("Divide by zero exction occured.");
    }
    finally{
        System.out.println("Program Complete");
    }
    }
}
