package string;

public class RemoveChar {

	public String replace(String text, char character) {
		if (text != null) {
			return text.replace(String.valueOf(character), "");
		}

		return text;
	}
}
