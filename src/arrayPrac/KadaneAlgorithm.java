package arrayPrac;

/*You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
Constraints:
        1 ≤ arr.size() ≤ 105
        -104 ≤ arr[i] ≤ 104
*/

public class KadaneAlgorithm {
    public static int maxSubarraySum(int[] arr) {
        // Initialize both to the first element
        int maxSum = arr[0];
        int currentSum = arr[0];

        // Iterate through the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // Either extend the existing subarray or start new one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum if current sum is larger
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static int maxSubarraySumWM(int[] arr) {
        // Initialize variables
        int maxSum = arr[0];
        int currentSum = arr[0];

        // Iterate through the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // Decide whether to extend current subarray or start new one
            if (currentSum + arr[i] > arr[i]) {
                currentSum = currentSum + arr[i];
            } else {
                currentSum = arr[i];
            }

            // Update maximum sum if current sum is larger
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Maximum sum: " + maxSubarraySum(arr1)); // Output: 11

        // Test case 2
        int[] arr2 = {-2, -4};
        System.out.println("Maximum sum: " + maxSubarraySum(arr2)); // Output: -2

        // Test case 3
        int[] arr3 = {5, 4, 1, 7, 8};
        System.out.println("Maximum sum: " + maxSubarraySum(arr3)); // Output: 25

        int[] arr4 = {1, 2, 3, -2, 5};
        System.out.println("Maximum sum: " + maxSubarraySum(arr4)); // Output: 25
    }
}

