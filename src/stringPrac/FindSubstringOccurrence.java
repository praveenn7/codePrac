package stringPrac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FindSubstringOccurrence {

	public static void main(String[] args) throws IOException {
		
		String s="This is Hello World This is This is This is";
	    String sub = "This is";
	    
	    //int count = s.split(sub, -1).length-1;
	    
	    int count = 0;
        int index = 0;

        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }

        System.out.println("Count: " + count);
        
        
        
        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "//src//checkString.txt"));
        
        String line;
        count = 0;
        
        
        while ((line = br.readLine()) != null) {
        	index=0;
        	while ((index = line.indexOf(sub, index)) != -1) {
        		count++;
        		index = index + sub.length();
        	}
        }
	    
	  System.out.println(count);

	    

	}

}
