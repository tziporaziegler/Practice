package string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeAndOrderStringChars {

	public MergeAndOrderStringChars() {

	}

	public String method(String[] strings) {
		ArrayList<Character> chars = new ArrayList<Character>();
		for (String s : strings) {
			List<Character> newChars = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
			chars.addAll(newChars);
		}
		return chars.stream().map(e -> e.toString()).collect(Collectors.joining());
	}

	static String MergeStrings(String[] strings) {
		if (strings == null)
			return null;

		String str = Arrays.toString(strings);

		char[] chars = str.toString().toCharArray();
		Arrays.sort(chars);

		StringBuilder builder = new StringBuilder();

		for (char c : chars) {
			if (Character.isLetter(c)) {
				builder.append(c);
			}
		}

		return builder.toString();
	}
}
