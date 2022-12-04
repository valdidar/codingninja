package Arrays;

public class arrange {
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
}
