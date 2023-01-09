package recursion;
import java.util.Scanner;
import java.text.DecimalFormat;
public class GeometricSum {
	public static double findGeometricSum(int k){
		if(k==0){
			return (double)1;
		}
		return (double)1+findGeometricSum(k-1)/(double)2;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}
