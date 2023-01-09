package timeComp;
import java.util.Arrays;
import java.util.Scanner;
public class PairSum {
	public static int pairSum(int[] arr, int num) {
		Arrays.sort(arr);
		int i=0,j=arr.length-1;
		int count=0;
		int sf,ef;
		while(i<j){
			if(arr[i]+arr[j]==num){
				if(arr[i]==arr[j]){
					int n=j-i+1;
					count+=(n*(n-1))/2;
					break;
				}
				sf=1;
				ef=1;
				while(arr[i+1] == arr[i]){
					sf++;
					i++;
					if(i==arr.length)
			 			break;
				}
				while(arr[j-1] == arr[j]){
					ef++;
					j--;
					if(j==0)
			 			break;
				}
				count+=sf*ef;
				i++;
				j--;
			}
			
			else if(arr[i]+arr[j]>num){
				j--;
			}
			
			else{
				i++;
			}
		}
		return count;
	}
	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	    	int arr[]=new int[n];
	    	for(int i=0;i<n;i++) {
	    		arr[i]=s.nextInt();
	    	}
	    	int num=s.nextInt();
	    	System.out.println(pairSum(arr, num));
	    }
}
