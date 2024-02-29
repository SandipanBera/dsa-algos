package java_dsa;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 9, 12 };
             
       
        int target=3;
        int result = search(arr, target);
        System.out.println("index of the target: "+result);
    
    }

    public static int search(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            
           } 
        
        
       }
        return -1;
    }
}