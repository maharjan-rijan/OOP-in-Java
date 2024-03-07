package StringHanldling;

public class array {
    public static void main(String[] args) {
        // String strl[] = {"Hello","Kathmandu", "Age","Bernhardt"};
        String str = "Hello Kathmandu BernHardt";
        // for(int i = 0; i< strl.length; i++){
        //     System.out.println(strl[i]);
        // }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }    
        //Upper Case
        System.out.println(str.toUpperCase());
        //Break String
        System.out.println(str.substring(7));
        //Character Replace
        System.out.println(str.replace('a', 'A'));
    }
}
