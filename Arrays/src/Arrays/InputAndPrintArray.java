package Arrays;
import java.util.Scanner;
public class InputAndPrintArray {
	public static int largest(int[] arr) {
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				arr[i-1]+=arr[i];
				arr[i]=arr[i-1]-arr[i];
				arr[i-1]-=arr[i];
			}
		}
		return arr[arr.length-1];
	}
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int[] inputArray() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
		
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]=inputArray();
		printArray(arr);
		System.out.println(sum(arr));
		System.out.println(largest(arr));
	}
}
