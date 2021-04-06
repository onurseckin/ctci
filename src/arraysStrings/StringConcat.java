package arraysStrings;

import java.util.ArrayList;

public class StringConcat {

	public static ArrayList<String> merge(String[] words, String[] more) {
		ArrayList<String> sentence = new ArrayList<String>();
		for (String w : words)
			sentence.add(w);
		for (String w : more)
			sentence.add(w);
		return sentence;
	}

	public static void main(String[] args) {
		String[] str1 = { "aa", "bb", "cc" };
		String[] str2 = { "dd", "ee", "ff" };
		System.out.println(merge(str1, str2));
	}

}