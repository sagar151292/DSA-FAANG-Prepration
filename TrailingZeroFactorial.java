package com.dsa.faang;

public class TrailingZeroFactorial {

	
	public static void main(String[] args) {
		
		// factorial of 5 is 120
		System.out.println( trailingZero(5));
	}
	
	public static int trailingZero(int n) {
		int count = 0;
		while (n > 0) {
			n /= 5;
			count += n;

		}
		return count;
	}
}
