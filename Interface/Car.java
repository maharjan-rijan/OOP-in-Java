public class Car implements Vehicle, Hire {
    public void start(){
        System.out.println("Started....");
    }
    public void stop(){
        System.out.println("Stoped....");
    }
    public void trunright(){
        System.out.println("Turned Right....");
    }
    public void trunleft(){
        System.out.println("Turned Left....");
    }
    public void applyBreak(){
        System.out.println("Break Applied....");
    }
    public void calculateCharge(){
        System.out.println("Your Car Charge is $22000.");
    }
    public void calculateTax(){
        System.out.println("Your Tax is 12%");
    }
    }
