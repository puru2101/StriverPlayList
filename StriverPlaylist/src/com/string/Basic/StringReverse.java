package com.string.Basic;

public class StringReverse {

	public static String reverse(String string) {

		if (string == null || string.length() <= 1) {
			return string;
		}

		
		return reverse(string.substring(1)) + string.charAt(0);
	}

	public static void main(String[] args) {

		String s = "purumishra";
		System.out.println(reverse(s));
		
	}

}
