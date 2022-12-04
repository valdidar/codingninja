package Arrays;

public class LargestArray {
	public static int largest(int[] arr) {
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i]<largest)
				largest=arr[i];
		return largest;
	}
}
