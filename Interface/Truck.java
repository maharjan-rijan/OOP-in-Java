public class Truck implements HeavyVehicle, Hire {
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
    public void color(){
        System.out.println("Color is Red.");
    }
    public void calculateCharge(){
        System.out.println("Your Truck Charge is $12097");
    }
    public void calculateTax(){
        System.out.println("Your Tax is 12%");
    }
}
