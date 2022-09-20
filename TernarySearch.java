package com.dsa.faang;

public class TernarySearch {

	public static void main(String[] args) {
		int[] searchArray = { 32, 45, 48, 53, 56, 59, 65, 76, 78, 87, 99 };
		int left = 0;
		int right = searchArray.length;
		System.out.println(ternarySearchimpl(searchArray, left, right, 65));

	}

	public static int ternarySearchimpl(int[] x, int left, int right, int element) {

		if (left <= right) {
			int mid1 = left + (right - left) / 3;
			int mid2 = right - (right - left) / 3;
			if (element == x[mid1]) {
				return mid1;
			}
			if (element == x[mid2]) {
				return mid2;
			} else if (element < x[mid1]) {
				return ternarySearchimpl(x, left, mid1 - 1, element);
			} else if (element > x[mid2]) {
				return ternarySearchimpl(x, mid2 + 1, right, element);
			} else {
				return ternarySearchimpl(x, mid1 + 1, mid2 - 1, element);
			}

		}
		return -1;
	}
}
