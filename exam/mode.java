package exam;

import java.util.HashMap;

public class mode {
    public static void main(String[] args) {
        System.out.println("mode is:"+calculateMode(new int[]{2,4,6,8,6,9,10,6}));
        
    }

    private static int calculateMode(int[] i) {
        int maxCount = Integer.MIN_VALUE;
        int result=0;
        HashMap<Integer, Integer> map = new HashMap<>(); //create a hashmap to store the frequency of each number in array 
        for (int j : i) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
       for (int key : map.keySet()) {
        if (map.get(key)>maxCount) {
            maxCount = map.get(key);
            result=key;
        }
       }
        
        return result;
   
    }
    
}
