package recursion;

public class CheckXInArray {
	public static boolean checkNumber(int input[], int x) {
		if(input.length==1)
			return input[0]==x;
		int smol[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smol[i-1]=input[i];
		}
		return input[0]==x||checkNumber(smol,x);
	}
}
