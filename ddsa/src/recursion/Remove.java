package recursion;

public class Remove {
	public static String removeX(String input){
		if(input.length()==1) {
			if(input.charAt(0)=='x')
				return "";
			else
				return input;
		}
		if(input.charAt(0)=='x')
			return removeX(input.substring(1));
		else
			return input.charAt(0)+removeX(input.substring(1));
	}
}
