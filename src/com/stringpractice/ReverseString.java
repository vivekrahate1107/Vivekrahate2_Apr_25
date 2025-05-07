package com.stringpractice;

public class ReverseString {

	void printReverse(String inputString) {
		String outputString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			outputString += inputString.charAt(i);
		}
		System.out.println("Reverse String = " + outputString);

	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.printReverse("Vivek Rahate");
	}

}
