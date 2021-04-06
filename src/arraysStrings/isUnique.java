package arraysStrings;

// Implement an algorithm to determine if a string has all unique characters
// What if you cannot use additional data structures?
// ASCII 128 

public class IsUnique {

	public static void main(String[] args) {
		String[] words = { "abcde", "hello", "apple", "kite", "padle" };
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

	private static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val])
				return false;
			charSet[val] = true;
		}
		return true;
	}

}
