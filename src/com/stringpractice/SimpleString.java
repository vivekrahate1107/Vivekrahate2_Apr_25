package com.stringpractice;

public class SimpleString {

	String outputString = "";

	public void printString(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {
			outputString += inputString.charAt(i);
		}
		System.out.println("Sample String = " + outputString);

	}

	public static void main(String[] args) {
		SimpleString simpleString = new SimpleString();
		simpleString.printString("Vivek Rahate");
	}

}
