package operatorsAndForLoop;
import java.util.Scanner;
public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1||n==2){
			System.out.println(1);
		}
		else {
			int j=0;
			for(int i=3,j1=1,j2=1;i<=n;i++,j2=j1,j1=j){
				j=j1+j2;
			}
			System.out.println(j);
		}
	}
}
