package Java8;

//import java.util.HashMap;

public class TargetSum_Pair {

	public static void main(String[] args) {
		 int[] arr = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
	        int targetSum = 6;

	        System.out.println("Integer numbers, whose sum is equal to " + targetSum + ":");

	        // Loop through the array to find pairs
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                // Check if the sum of arr[i] and arr[j] equals the target sum
	                if (arr[i] + arr[j] == targetSum) {
	                    // Print the pair if their sum matches the target
	                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	                }
	            }
	        }
	    }
	}