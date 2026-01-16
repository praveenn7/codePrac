package arrayPrac;

import java.util.HashSet;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1
*/

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i : nums) {
            if (hs.contains(i))
                hs.remove(i);
            else
                hs.add(i);
        }

        return hs.iterator().next();

    }

	public static void main(String[] args) {
		
		int[] nums = {4,3,3,4,8,7,8,1,1};	
		System.out.println(singleNumber(nums));

	}

}
