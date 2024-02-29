package java_dsa;

public class merge_sort {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 12, 1, 3 };
        System.out.println("array before sorting");
        display(arr);
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\narray after sorting");
        display(arr);
    }

    private static void mergeSort(int[] arr, int i, int j) {
        if (i>=j) return;
        int mid=(i+j)/2;
        mergeSort(arr, i, mid);
        mergeSort(arr, mid + 1, j);
        merge(arr, i, mid, j);
    }

    private static void merge(int[] arr, int i, int mid, int j) {
        int[] left = new int[mid - i + 1];
        int[] right = new int[j - mid];
        int k = i;
        int l = 0;
        int r = 0;
        for (int index = 0; index <left.length; index++) {
            left[index] = arr[i + index];
        }
        for (int index = 0; index < right.length; index++) {
            right[index] = arr[mid + 1 + index];

        }
        while (l< left.length && r < right.length) {
            if (left[l] < right[r]) {
                arr[k++] = left[l++];
            } else {
                arr[k++] = right[r++];
            }
        }
        while (l < left.length) {
            arr[k++] = left[l++];
        }
            while (r < right.length) {
                arr[k++] = right[r++];
            }
        }

    private static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
