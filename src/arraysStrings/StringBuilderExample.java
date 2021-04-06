package arraysStrings;

public class StringBuilderExample {

	public static String joinWords(String[] words) {
		StringBuilder sentence = new StringBuilder();
		for (String w : words) {
			sentence.append(w);
		}
		return sentence.toString();
	}

	public static void main(String[] args) {
		String[] str = { "Hello,", " world!" };
		System.out.println(joinWords(str));
	}

}
