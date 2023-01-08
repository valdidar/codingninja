package recursion;
import java.util.Scanner;
public class MergeSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
	public static void mergeSort(int[] input){
		if(input.length<=1) {
			return;
		}
		int fh[]=new int[input.length/2];
		int sh[]=new int[input.length-fh.length];
		for(int i=0;i<input.length;i++) {
			if(i>=fh.length) {
				sh[i-fh.length]=input[i];
			}else {
				fh[i]=input[i];
			}
		}
		mergeSort(fh);
		mergeSort(sh);
		int temp[]=merge(fh,sh);
		for(int i=0;i<input.length;i++) {
			input[i]=temp[i];
		}
		printArray(input);
		
	}
	public static int[] merge(int arr1[], int arr2[]) {
   	 int m = arr1.length;
       int n = arr2.length;
       int arr3[] = new int[m+n];
       int i=0, j=0, k=0;
       while(i<m && j<n){
           if(arr1[i]<=arr2[j]){
               arr3[k] = arr1[i];
               i++;
               k++;
           }else{
               arr3[k] = arr2[j];
               j++;
               k++;
           }
       }
       while(i<m){ 
           arr3[k] = arr1[i];
           i++;
           k++;
       }
       while(j<n){ 
           arr3[k] = arr2[j];
           j++;
           k++;
       }
    return arr3;
   }
}
