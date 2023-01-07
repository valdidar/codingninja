package recursion;

public class LastIndex {
	public static int lastIndex(int input[], int x) {
		return lastIndex(input,x,input.length-1);
	}
	public static int lastIndex(int[] input, int x, int i) {
		if(i<0)
			return -1;
		if(input[i]==x)
			return i;
		return lastIndex(input,x,i-1);
	}
}
