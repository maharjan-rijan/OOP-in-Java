package Assignment;
//Write a java program to find the largest element of an given array
//Assignment 1.5
public class arraylen {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 56, 34, 10};
        int large = arr[0];
        for(int i=0; i<arr.length; i++)
        {
          if(large < arr[i])
          {
            large = arr[i];
          }
        }
        System.out.println(large); 
    }
}
