package Arrays;

public class InsertionOfTwoArray {
	public static void intersections(int arr1[], int arr2[]) {
    	int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
