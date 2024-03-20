import java.util.Random;
// Importing random package in java
public class RandomPack {

    public static void main(String[] args) {
        Random random = new Random();
        //It generate boolean value
        System.out.println(random.nextBoolean());
        //It generate double value
        System.out.println(random.nextDouble());
        //It generate float value
        System.out.println(random.nextFloat());
        //It generate integer value
        System.out.println(random.nextInt());
        //It generate integer value with specific limit
        System.out.println(random.nextInt(100));
    }
}