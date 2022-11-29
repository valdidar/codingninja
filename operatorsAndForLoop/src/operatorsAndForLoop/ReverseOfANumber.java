package operatorsAndForLoop;
import java.lang.Math;
import java.util.Scanner;
public class ReverseOfANumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0;
		
//		for(int i=1;i<=n1;i++) {
//			r+=(ntemp%10)*Math.pow(10, n1-i);
//			ntemp=ntemp/10;
//		}
		while(n>0) {
			r=10*r+n%10;
			n/=10;
		}
		System.out.println(r);
	}
}
