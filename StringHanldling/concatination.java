package StringHanldling;

public class concatination {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "BernHardt";
        String space = " ";
        String str3 = str1.concat(space);
        str3 = str3.concat(str2);
        System.out.println(str3);
    }
}