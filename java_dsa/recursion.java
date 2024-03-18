package java_dsa;

public class recursion {
    public static void loop(int n) {
        if (n == 1) {
            System.out.print(" " +n); // base case: when n is equal to 1, print the value of n and stop the recursion
            return;
        }     
        loop(n - 1);
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        loop(10);
    }
    
}
