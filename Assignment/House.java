package Assignment;
//Write a Jave Program to illustrate class and object
// Assignment 2.1
public class House {
    private String color;
    private int price;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    
    public static void main(String[] args) {
        House house = new House();
        house.setColor("Red");
        house.setPrice(78000000);
        System.out.println("Color = "+house.getColor());
        System.out.println("Price = "+house.getPrice());

    }
}
