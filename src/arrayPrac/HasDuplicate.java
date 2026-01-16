package arrayPrac;

import java.util.HashSet;

public class HasDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int n : nums) {
            if (!hs.add(n))
            	return true;
        }
        
        return false;

    }

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));

	}

}
