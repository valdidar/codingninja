package Arrays;

public class SelectionSort {
	 public static void selectionSort(int[] arr) {
    	 int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1; 
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }   
}	
