package com.string.Basic;

public class Palindrome {

	public static void palindrome(String s) {

		int start = 0;
		int end = s.length() - 1;

		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				System.out.println("String is not a Palindrome");
				break;
			}
			System.out.println("String is palindrome");
			break;
		}

	}

	public static void main(String[] args) {
		String s = "NitiN";
		palindrome(s);
	}

}
