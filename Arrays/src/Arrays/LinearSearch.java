package Arrays;

public class LinearSearch {
	public static int linearSearch(int arr[], int x) {
		for(int i=1;i<arr.length;i++)
			if(arr[i]==x)
				return i;
		return -1;
	}
}
