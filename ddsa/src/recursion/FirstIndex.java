package recursion;

public class FirstIndex {
	public static int firstIndex(int input[], int x) {
		if(input[0]==x)
			return 0;
		return firstIndex(input,x,1);
	}

	public static int firstIndex(int[] input, int x, int i) {
		if(i>=input.length)
			return -1;
		if(input[i]==x)
			return i;
		return firstIndex(input,x,i+1);
	}
}
