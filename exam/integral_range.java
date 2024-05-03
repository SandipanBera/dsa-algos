package exam;

public class integral_range {
    public static int sum(int m, int n) {
        int divisible = 0;
        int notDivisible = 0;
        for (int index = 1; index < n + 1; index++) {
            if (index % m == 0) {
                divisible += index;

            } else {
                notDivisible += index;
            }

        }
        return divisible>notDivisible?divisible-notDivisible:notDivisible-divisible;
        
    }

    public static void main(String[] args) {
        System.out.println("The sum of numbers from 1 to 20 that are divisible by 3 is: " + sum(6, 30));
        
    }
    
}
