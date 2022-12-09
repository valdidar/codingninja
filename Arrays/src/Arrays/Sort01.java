package Arrays;

public class Sort01 {
	public static void sortZeroesAndOne(int[] arr) {
        int nextZeros = 0;
    	for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZeros];
                arr[nextZeros] = arr[i];
                arr[i] = temp;
                nextZeros++;
            }
        }
    }
}
