package exam;
public class krishnamurthy_number {
    public static void main(String[] args) {
        int n = 145; // Krishnamurthy number example
        int digit = n;
        int sum = 0;
        while (digit > 0) {
            
            sum += factorial(digit%10);
            digit /= 10;

        }
       if (sum == n) System.out.println("Krishnamurthy Number");
       else System.out.println("Not a Krishnamurthy Number");
    }

    public static int factorial(int a) {
        if (a <= 1) {
            return 1;
        }
        return factorial(a - 1) * a;
    }


}
