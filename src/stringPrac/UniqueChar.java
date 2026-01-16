package stringPrac;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {

	public static void main(String[] args) {
		
		String s = "Programming";
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			result.put(c, result.getOrDefault(c, 0)+1);
		}
		
		for (Map.Entry<Character, Integer> m: result.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
			}
		}

	}

}
