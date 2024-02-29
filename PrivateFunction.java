//Declearing Car function
public class PrivateFunction {
    private String color;
    private int price;

    public String getColor() {
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
        PrivateFunction car = new PrivateFunction();
        car.color = "Red";
        car.setPrice(120080000);
        System.out.println("Color = " +car.getColor());
        System.out.println("Price = "+car.getPrice());
    }
}
