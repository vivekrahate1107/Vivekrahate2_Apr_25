package com.stringpractice;

public class DigitInString {

	void getDigit(String input) {
		int countDigit = 0;
		int sumDigit = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				countDigit++;
				sumDigit += Character.getNumericValue(c);
			}

		}
		System.out.println("Count of Digits = " + countDigit);
		System.out.println("Sum of Digits = " + sumDigit);

	}

	public static void main(String[] args) {
		DigitInString digitInString = new DigitInString();
		digitInString.getDigit("vivek123Rahate#$%8");

	}

}
