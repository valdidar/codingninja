package recursion;

public class BinarySearchRecursion {
	public static int binarySearch(int a[], int x, int si, int ei) {
		if(si<ei) {
			return -1;
		}
		int mi=(si+ei)/2;
		if(a[mi]==x) {
			return mi;
		}else if(a[mi]>x) {
			return binarySearch(a,x,si,mi-1);
		}else {
			return binarySearch(a,x,mi+1,ei);			
		}
	}
}
