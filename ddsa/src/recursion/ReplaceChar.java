package recursion;

public class ReplaceChar {
	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 1) {
			if (input.charAt(0) == c1)
				return c2+"";
			else
				return input;
		}
		if (input.charAt(0) == c1)
			return c2+replaceCharacter(input.substring(1),c1,c2);
		else
			return input.charAt(0) + replaceCharacter(input.substring(1),c1,c2);

	}
}
