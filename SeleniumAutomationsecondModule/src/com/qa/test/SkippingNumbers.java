package com.qa.test;

public class SkippingNumbers {
	
	
	
//	Q5. Create a function using while loop to print numbers from 65 to 80
//	where 74 to 76 will be skipped.

	public static void main(String[] args) {

		int start = 65;
		while (start <= 80) {

			if (start >= 74 && start <= 76) {
				start++;
				continue;

			}

			System.out.println(start);
			start++;

		}

	}

}
