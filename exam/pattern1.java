package exam;
public class pattern1 {
    public static void main(String[] args) {
        printPattern(4);

    }
    //Method to print the pattern
    public static void printPattern(int n) {
        int value = 0;
        for (int index = 0; index <= n; index++) {
            for (int j = 0; j < index; j++) {
                value += 1;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    
}
