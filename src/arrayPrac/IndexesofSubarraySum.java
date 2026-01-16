package arrayPrac;
/*
Given an array arr[] containing only non-negative integers,
your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target.
You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
You need to find the first subarray whose sum is equal to the target.

        Note: If no such array is possible then, return [-1].

        Examples:

        Input: arr[] = [1, 2, 3, 7, 5], target = 12
        Output: [2, 4]
        Explanation: The sum of elements from 2nd to 4th position is 12.
        Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
        Output: [1, 5]
        Explanation: The sum of elements from 1st to 5th position is 15.
        Input: arr[] = [5, 3, 4], target = 2
        Output: [-1]
        Explanation: There is no subarray with sum 2.
        Constraints:
        1 <= arr.size()<= 106
        0 <= arr[i] <= 103
        0 <= target <= 109
*/

import java.util.ArrayList;

class IndexesofSubarraySum {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int currentSum = 0, start = 0;
        //int start = 0;

        // Iterate through the array
        for (int end = 0; end < arr.length; end++) {
            // Add current element to the window
            currentSum += arr[end];

            // Shrink window from left while current sum exceeds target
            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if we found the target sum
            if (currentSum == target) {
                result.add(start + 1);  // 1-based index
                result.add(end + 1);     // 1-based index
                return result;
            }
        }

        // No subarray found
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        ArrayList<Integer> result = subarraySum(arr, target);

        System.out.println(result);  // Output: [2, 5]
    }
}
