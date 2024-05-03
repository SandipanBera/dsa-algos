package exam;

import java.util.Arrays;

public class even_odd {
    public static int calculateEvenOdd(int[] arr) {
        Arrays.sort(arr);
        if (arr.length%2==0) {
            return arr[3]+arr[arr.length-4];
        } else {
            return arr[3] + arr[arr.length - 3];
            
        }
    
       
        
    }
    public static void main(String[] args) {
        int result = calculateEvenOdd(new int[] { 3, 2, 1, 7, 5, 4,9,12,78 });
      System.out.println("The sum of the second last and second number is " + result);
    }
    
}
