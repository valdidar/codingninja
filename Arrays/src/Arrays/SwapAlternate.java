package Arrays;

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			arr[i*2]+=arr[i*2+1];
			arr[i*2+1]=arr[i*2]-arr[i*2+1];
			arr[i*2]-=arr[i*2+1];
		}
    }
}
