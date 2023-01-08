package recursion;
import java.util.Scanner;
public class QuickSortRecursion {
	public static void swap(int[] a,int i,int j) {
		if(i==j)
			return;
		a[i]+=a[j];
		a[j]=a[i]-a[j];
		a[i]-=a[j];
	}
	public static void quickSort(int[] input) {
		if(input.length<=1) {
			return;
		}
		quickieSort(input,0,input.length);
		
	}
	public static void quickieSort(int[] input,int si, int ei) {
		if(ei<=si) {
			return;
		}
		int j=si;
		for(int i=si+1;i<ei;i++)
			if(input[si]>input[i])
				j++;
		swap(input,si,j);
		int k=ei-1;
		int i=si;
		while(i<j){
			if(input[j]<=input[i]) {
				while(input[k]>=input[j])
					k--;
				swap(input,i,k);
			}
			i++;
		}
		quickieSort(input,si,j);
		quickieSort(input,j+1,ei);
		
	}
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
}
