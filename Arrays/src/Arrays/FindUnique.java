package Arrays;

public class FindUnique {
	public static int findUnique(int[] arr){
		 int n = arr.length;
       for(int i=0;i<n;i++){
           int j;
           for(j=0;j<n;j++){
               if(i!=j){
                   if(arr[i]==arr[j]){
                       break;
                   }
               }
           }
           if(j==n){
               return arr[i];
           }
        }
       return Integer.MAX_VALUE;
   }
}
