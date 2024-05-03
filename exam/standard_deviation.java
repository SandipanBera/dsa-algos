package exam;

public class standard_deviation {
    public static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i]);
        }
        return sum / arr.length;

    }

    public static float sd(int[] arr) {
        double sqrSum = 0;
        int avg = average(arr);
        for (int i : arr) {
            sqrSum += Math.pow((i - avg), 2);
        }
        return (float) Math.sqrt(sqrSum / arr.length);
        
    }
    
    public static void main(String[] args) {
        // Test case: [3, 2, 5, 6]
        System.out.println("Standard deviation is " + sd(new int[]{ 3, 2, 5, 6}));

    }

}
