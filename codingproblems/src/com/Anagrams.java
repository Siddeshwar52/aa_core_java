package com;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "python";

		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		boolean value = Arrays.equals(c1, c2);

		if (value)
			System.out.println("Two Strings are Anagrams");
		else
			System.out.println("Two Strings are not Anagrams");

	}

}
