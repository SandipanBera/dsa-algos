package java_dsa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexpattern {
    public static void main(String[] args) {
        String input = "my name is $andipan martha cam ta1";
        int validWordsCount = countValidWords(input);
        System.out.println("Number of valid words: " + validWordsCount);
    }
    public static int countValidWords(String input) {
        String[] words = input.split(" ");
        int count = 0;
        Pattern pattern = Pattern.compile("^(?=.*[aeiou])(?=.*[bcdfghjklmnpqrstvwxyz])[a-zA-Z0-9]{3,}$");
        
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                count++;
                System.out.println("Valid word: " + word);
            }
        }
        
        return count;
    }
}
