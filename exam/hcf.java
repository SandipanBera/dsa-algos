package exam;

public class hcf {
    public static void main(String[] args) {
        int a = 24, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is : " + gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        else {
            return gcd(b, a % b);
        }
    }

}
