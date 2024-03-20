package Expection;

import java.io.*;
public class InputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream input = null;
        try{
            input = new FileInputStream("sample.txt");

            System.out.println("Char -"+(char)input.read());
            System.out.println("Char -"+(char)input.read());
        }  catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            input.close();
        }
    }
}
