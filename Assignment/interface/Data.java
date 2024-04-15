package Assignment.Interface;

class Data implements Government, LocalLevel {
    public void govt()
    {
        System.out.println("Government of Nepal");
    }

    public void local()
    {
        System.out.println("Government of Nepal");
    }
    public static void main(String[] args) {
        Data obj = new Data();
        obj.govt();
        obj.local();
    }
    
}
