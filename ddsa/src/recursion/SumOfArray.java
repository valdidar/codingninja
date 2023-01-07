package recursion;

public class SumOfArray {
	public static int sum(int input[]) {
		if(input.length==1)
			return input[0];
		int smol[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smol[i-1]=input[i];
		}
		return input[0]+sum(smol);
	}
}
