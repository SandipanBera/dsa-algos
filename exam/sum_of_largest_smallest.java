package exam;

public class sum_of_largest_smallest {
    public static void main(String[] args) {
        System.out.println(findSum(new int[]{9,5,2,1}));

    }
    public static int findSum(int[]arr) {
        int smallest = arr[0], largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;

            }

        }
        return smallest + largest;
    }
    
}
