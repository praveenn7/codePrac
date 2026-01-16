package stringPrac;

public class ReversrOnlyVowels {

	public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            // Move left pointer until we find a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            
            // Move right pointer until we find a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            
            // Swap vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }

	public static void main(String[] args) {
	
		System.out.println(reverseVowels("tech%12hub"));

	}

}
