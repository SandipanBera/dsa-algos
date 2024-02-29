package java_dsa;

public class Binarysearch {
    public static void main(String[] args) {
        //variable and function declare
        int arr[] = { 4, 6, 8, 9, 12, 15 };
        int target = 12;
        int result = binarysearch(arr, target);
        //result print
        if (result < 0) {
            System.out.println("element not present in array");

        } else {

            System.out.println("Index of element is " + result);
        }

    }
    //function for binary search

    public static int binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1; 
        while (left < right) {
          int mid=(left + right) / 2;   
            if ((target == arr[mid])) {
                return mid;
            }
            else if (target > arr[mid]) {
                left=mid+1 ;

            } else {
                right=mid-1;
            }
            
        }
        return -1;
    }

}
