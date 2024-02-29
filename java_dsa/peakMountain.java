package java_dsa;

public class peakMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 3, 2, 1 };
        int a = findPeak(arr);
        System.out.println(a);
    }
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1; 
        while (left < right) {
          int mid=(left + right) / 2;   
            if (arr[mid]<arr[mid+1]) {
                left = mid + 1;       
            } else {
                right=mid;
            }           
        }
        return arr[right];
    }
}
