 package Expection;

class TestCustomException1 {

    public static void main(String[] args) {
        try{
            valid(1);
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
   static void valid(int age) throws InvalidAgeException
   {
    if (age<18) {
        throw new InvalidAgeException("Age below 18 is not valid to vote");
    }
    else{
        System.out.println("Welcome to vote");
    }
   }
}