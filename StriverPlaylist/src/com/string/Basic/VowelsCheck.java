package com.string.Basic;

public class VowelsCheck {

	public static void vowelsCheck(String s) {

		char[] ch = s.toCharArray();

		String vowels = new String();
		String consonents = new String();

		for (char c : ch) {
			if ("AEIOUaeiou".indexOf(c) != -1) {
				vowels += c + ", ";
			} else
				consonents += c + ", ";

		}
		System.out.println("Vowels :" + vowels);
		System.out.println("Consonents :" + consonents);

	}

	public static void main(String[] args) {
		String s = "Missisippeeeeeeeeeeeei";
		vowelsCheck(s);
	}

}
