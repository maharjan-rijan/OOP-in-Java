package Encapsulation;

public class Test {
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
}
