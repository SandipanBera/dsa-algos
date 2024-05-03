package exam;

import java.util.HashMap;

/**
 * max_occurance
 */
public class max_occurance {

    public static void main(String[] args) {
        String str = "aabbbcc";
        char max_occurance = findMaxOccurance(str);
        String result = str.replace(max_occurance, 'f');
        System.out.println("Result: " + result);
        int sum = 0;
        int i, j;
        for ( i = 0, j = 0; i < 5 && j < 5; ++i, j = i + 1)
            ;
        sum += i;
        System.out.println(sum);

            
            
        
        
    }

    public static char findMaxOccurance(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        int maxCount = 0;
        Character res = str.charAt(0);
        for (Character c : map.keySet()) {
            if (maxCount < map.get(c)) {
                maxCount = map.get(c);
                res = c;
            } else if (maxCount == map.get(c)) {
                int minimum = Math.min(c, res);
                res = (char) minimum;
            }

        }
        return  res;
    }
}