package arrayPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Given an array nums of n integers where nums[i] is in the range [1, n], 
  return an array of all the integers in the range [1, n] that do not appear in nums.	 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 
Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/

public class FindNumbers {
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); 
            }
        }
        
        return result;
    }
	
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> result = new ArrayList<Integer>();
        
        for (int i : nums) {
        	hs.add(i);
        }
        
        for (int i=1 ; i<=nums.length ; ++i) {
        	if (!hs.contains(i))
        		result.add(i);
        	
        }
        
        return result;
    }

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};	
		System.out.println(findDisappearedNumbers2(nums));

	}

}
