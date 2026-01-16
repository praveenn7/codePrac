package stringPrac;

public class ReversrOnlyLetters {

	public static String reverseOnlyLetters(String s) {
		char[] chars = s.toCharArray();
		int i = 0, j = chars.length - 1;

		while (i < j) {
			// Skip non-letter characters from left
			while (i < j && !Character.isLetter(chars[i])) {
				i++;
			}

			// Skip non-letter characters from right
			while (i < j && !Character.isLetter(chars[j])) {
				j--;
			}

			// Swap letters
			if (i < j) {
				char temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
				i++;
				j--;
			}
		}

		return new String(chars);
	}

	public static void main(String[] args) {
	
		System.out.println(reverseOnlyLetters("tech%12hub"));

	}

}
