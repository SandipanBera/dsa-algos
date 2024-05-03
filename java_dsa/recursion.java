package java_dsa;

public class recursion {
    public static void loop(int n) {
        if (n == 1) {
            System.out.print(n); // base case: when n is equal to 1, print the value of n and stop the recursion
            return;
        }
        loop(n - 1);
        System.out.print(" " + n);
    }

    public static void sort(int[]arr,int start, int end) {
        if (start>=end) {
            return;
        }
        int mid = (start+end)/2;
        sort(arr, start, mid);
        sort(arr, mid+1, end);
    }

    public static void main(String[] args) {
        loop(10);
        System.out.println();
        int[] arr = { 4, 67, 35, 98, 23 };
        sort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
