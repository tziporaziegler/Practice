package string.palindromeCheck;

/**
 * Program includes three methods of checking if a string is a valid palindrome.
 *
 * @author Tzipora Ziegler
 * @see <a https://en.wiktionary.org/wiki/Appendix:English_palindromes">Wiktionary list of palindromes</a>
 */
public class PalindromeCheck {

	/**
	 * Uses a while loop to test if the text is a valid palindrome
	 * 
	 * @param text The string to test if is a palindrome
	 * @return Returns whether the text is a valid palindrome
	 */
	public boolean whileCheck(String text) {
		if (text == null || text.length() < 2) {
			return false;
		}

		int startIndex = 0;
		int endIndex = text.length() - 1;

		while (endIndex > startIndex) {
			if (text.charAt(startIndex) != text.charAt(endIndex)) {
				return false;
			}

			endIndex--;
			startIndex++;
		}

		return true;
	}

	/**
	 * Uses StringBuilder's reverse() method to test if the text is a valid palindrome
	 * 
	 * @param text The string to test if is a palindrome
	 * @return Returns whether the text is a valid palindrome
	 */
	public boolean stringBuilderCheck(String text) {
		if (text == null || text.length() < 2) {
			return false;
		}

		StringBuilder builder = new StringBuilder(text);
		return builder.toString().equals(builder.reverse().toString());
	}

	/**
	 * Uses a for loop to test if the text is a valid palindrome
	 * 
	 * @param text The string to test if is a palindrome
	 * @return Returns whether the text is a valid palindrome
	 */
	public boolean forLoopCheck(String text) {
		if (text == null || text.length() < 2) {
			return false;
		}

		int endIndex = text.length() - 1;
		int middleIndex = text.length() / 2;

		for (int i = 0; i <= middleIndex; i++) {
			if (text.charAt(i) != text.charAt(endIndex - i)) {
				return false;
			}
		}

		return true;
	}

}
