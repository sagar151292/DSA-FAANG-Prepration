package com.dsa.faang;

public class SumOfTwo {

	public static void main(String[] args) {

		int arr[] = { 10, 1, 2, 13, 41, 56, 63, 7, 18 };

		twoSum(arr, 11);
	}

	/*
	 * Take two forloop and run with i, j where i
	 * start with 0 and j start with i+1 and increment j till length
	 * after increment i and again run j  and find the target
	 * */
	
	public static void twoSum(int[] nums, int target) {

		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				if (nums[i] + nums[j] == target)

					System.out.println("  " + nums[i] + "   " + nums[j]);

			}
		}
	}
	
	//2nd approach
	
	

}
