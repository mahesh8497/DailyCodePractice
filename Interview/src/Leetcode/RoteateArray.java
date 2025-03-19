package Leetcode;

import java.util.Arrays;

public class RoteateArray {
	

	 public static void rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k % n; // Handle cases where k > n
	        
	        reverse(nums, 0, n - 1);   // Step 1: Reverse entire array
	        reverse(nums, 0, k - 1);   // Step 2: Reverse first k elements
	        reverse(nums, k, n - 1);   // Step 3: Reverse remaining elements
	    }

	    private static void reverse(int[] nums, int left, int right) {
	        while (left < right) {
	            int temp = nums[left];
	            nums[left] = nums[right];
	            nums[right] = temp;
	            left++;
	            right--;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;

	        System.out.println("Original array: " + Arrays.toString(nums));
	        rotate(nums, k);
	        System.out.println("Rotated array: " + Arrays.toString(nums));
	    
	}

}
