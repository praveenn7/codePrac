package stringPrac;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        
        // Convert to lowercase and add each letter to set
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        
        return set.size() == 26;
    }
    
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        if (checkIfPangram(text)) {
            System.out.println("Yes, it is a pangram");
        } else {
            System.out.println("No, it is not a pangram");
        }
    }
}
