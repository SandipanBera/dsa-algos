package exam;

public class max_length_substring {
    public static void main(String[] args) {
System.out.println(findMaxLength("I love the dog"));
    }
    public static int  findMaxLength(String str) {
        String[] arr = str.split(" ");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i].length());

        }
        return max;
    }
    
}
