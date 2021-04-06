package arraysStrings;

import java.util.Arrays;

// Given two strings, write a method to decide if one is a permutation of the other

public class CheckPermutation {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dabc";
		System.out.println("Naive " + Naive(str1, str2));
		System.out.println("Optimized " + Optimized(str1, str2));
	}

	private static boolean Naive(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < str1.length(); i++) {
			if (ch1[i] != ch2[i])
				return false;
		}
		return true;

	}

	private static boolean Optimized(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		int[] letters = new int[128]; // ASCII
		for (int i = 0; i < str1.length(); i++) {
			letters[str1.charAt(i)]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			letters[str2.charAt(i)]--;
			if (letters[str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}
}
