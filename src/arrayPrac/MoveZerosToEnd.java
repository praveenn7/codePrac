package arrayPrac;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int j = 0;  // Position for next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    
    public static void moveZeroes1(int[] nums) {
        int l=nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j=l ; j>i ; j--) {
                	if (nums[j] != 0) {
                		int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        j--;
                	}
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));  // [1, 3, 12, 0, 0]
    }
}
