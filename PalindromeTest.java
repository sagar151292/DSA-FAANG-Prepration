package com.dsa.faang;

public class PalindromeTest {
	public static void main(String[] args) {
		
		// where n is >0
		int n = 121;
		System.out.println(ispalindrome(n));

	}

	public static boolean ispalindrome(int n) {

		if (n < 0 || (n != 0 && n % 10 == 0)) {
			return false;
		}
		int sum = 0;
		while (n > sum) {

			sum = sum * 10 + n % 10;
			n /= 10;
		}
		return n == sum || n == sum / 10;
	}

}
