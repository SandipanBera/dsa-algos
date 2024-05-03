package exam;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        System.out.println("median is: " + findMedian(arr));
    }

    private static float findMedian(int[] arr) {
        if (arr == null) {
            return -1;
        }
        int n = arr.length;
        // check if the length of input array is even or odd
        boolean isEven = (n % 2 == 0);
        // sort the array in ascending order
        Arrays.sort(arr);
        // calculate the middle index
        int midIndex = n / 2;
        // if the number is odd , take the middle element as the result
        // else average the left and right half elements
        float med = isEven ? ((float) arr[midIndex - 1] + (float) arr[midIndex]) / 2 : arr[midIndex];
        return med;

    }
}
