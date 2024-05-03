package exam;

public class automorphic_number {
    public static void main(String[] args) {
        System.out.println(findAutomorphic(76));
    }

    public static boolean findAutomorphic(int num) {
        int square = num * num;
        double divisor = Math.pow(10, Integer.toString(num).length());
        int remainder = (int) (square % divisor);
        if (remainder == num) {
            return true;

        }
        return false;
    }
}
