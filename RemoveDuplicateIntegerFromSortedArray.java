package com.dsa.faang;

public class RemoveDuplicateIntegerFromSortedArray {
	public static void main(String[] args) {
		int[] intarr = { 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 8, 8 };
		System.out.println(removeDuplicates(intarr));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		}
		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[nums.length - 1];
		return j;

	}
}
