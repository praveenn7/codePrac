 package stringPrac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharInStr {

    public static void findDuplicateChar(String str) {
    	
    	char[] ch = str.toCharArray();
    	
    	Map<Character, Integer> result = new LinkedHashMap<Character, Integer>();
    	
    	for (char c : ch) {
    		result.put(c, result.getOrDefault(c, 0)+1);
    	}
    	
    	//System.out.println(result);
    	for (Map.Entry<Character, Integer> entry : result.entrySet()) {
    		System.out.println(entry.getKey() + " -> " + entry.getValue());
    	}

    }

    public static void main(String[] args) {
    	findDuplicateChar("hello");
    }

}
