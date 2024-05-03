package exam;
import java.util.HashSet;
import java.util.Set;

public class distinct_number {
    public static void main(String[] args) {
        System.out.println(getDistinctNumberCount("1210"));

    }

    public static int getDistinctNumberCount(String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int[] arr = new int[10];
        for (int index = 0; index < str.length(); index++) {
            arr[str.charAt(index) - '0']++;
            set.add(str.charAt(index));
        }
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index)-'0'!=arr[index]) {
                return 0;
            }
        }
        return set.size();
    }
}
