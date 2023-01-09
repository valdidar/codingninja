package recursion;
import java.util.Scanner;
public class CheckAB {
	public static boolean checkAB(String input) {
		if(input.length()==0){
			return true;
		}
		if(input.charAt(0)=='b'){
			return false;
		}
		return checkABB(input);
	}
	public static boolean checkABB(String input){
		if (input.length() <= 1)
			return true;
		if(input.charAt(1)=='a')
			return checkABB(input.substring(1));
		if (input.length() == 2)
			return false;
		if(input.charAt(2)=='a')
			return false;
		if(input.length()==3)
			return true;
		if(input.charAt(3)=='b')
			return false; 
		return checkABB(input.substring(3));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}
}
