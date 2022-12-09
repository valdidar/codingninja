package Arrays;
import java.util.Scanner;
public class InputAndPrintArray {
	public static void swapAlternate(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			arr[i*2]+=arr[i*2+1];
			arr[i*2+1]=arr[i*2]-arr[i*2+1];
			arr[i*2]-=arr[i*2+1];
		}
			
    }
	 public static void arange(int[] arr, int n) {
		 for(int i=0;i<n;i++)
				if(i%2==0)					
					arr[i/2]=i+1;
				else				
					arr[n-((i+1)/2)]=i+1;
		 for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
	    }
	public static int linearSearch(int arr[], int x) {
		for(int i=1;i<arr.length;i++)
			if(arr[i]==x)
				return i;
		return -1;
	}
	public static int largest(int[] arr) {
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i]>largest)
				largest=arr[i];
		return largest;
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
		int arr[];
		arr=inputArray();
		
//		printArray(arr);
		
//		System.out.println(sum(arr));
		
//		System.out.println(largest(arr));
		
//		System.out.println(linearSearch(arr,5));
		
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		arr=new int[n];
//		arange(arr,n);
		
//		swapAlternate(arr);
//		printArray(arr);		
	}
}
