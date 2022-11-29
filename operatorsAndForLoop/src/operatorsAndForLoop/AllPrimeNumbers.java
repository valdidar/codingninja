package operatorsAndForLoop;
import java.util.Scanner;
public class AllPrimeNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			boolean status=true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					status=false;
			}
			if(status==true) {
				System.out.println(i);
			}
		}
	}
}
