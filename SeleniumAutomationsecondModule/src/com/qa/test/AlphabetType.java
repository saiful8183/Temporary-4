package com.qa.test;

public class AlphabetType {

	public static void main(String[] args) {
		
		
		findAlphabetType('0');
		
		
		

	}

	public static void findAlphabetType(char input) {

		if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||

				input == 'A' || input == 'E' || input == 'I' || input == 'o' || input == 'U') {

			System.out.println(input + " is a vowal.");

		} else if ((input >= 'a' && input <= 'z') || (input >= 'a' && input <= 'z')) {

			System.out.println(input + "is a consonent.");

		} else {

			System.out.println(input  +  "is a not a letter !!.");

		}

	}

}
