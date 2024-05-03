package exam;
import java.util.HashMap;
import java.util.Map;

public class letter_map {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
 String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 Map<Integer, String> map = new HashMap<>();
 int num1=728,num2=12;
 for (int index = 0; index < 10; index++) {
     map.put(index,Integer.toString(index) );
 }
 for (int index = 10; index < 36; index++) {
     map.put(index,Character.toString(s.charAt(index - 10)) );
 }

 int remainder = num1 % num2;
 int quoitent = num1 / num2; 
 String result = map.get(remainder);
 while (remainder > 0) {
     remainder = quoitent % num2;
     quoitent /= num2;
     result += map.get(remainder);
 }
 System.out.println("Result: " + reverse(result));
    }

}