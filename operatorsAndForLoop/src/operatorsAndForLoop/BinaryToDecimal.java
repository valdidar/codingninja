package operatorsAndForLoop;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		int d=0,m=1;
		while(b>0) {
			d+=m*(b%10);
			m*=2;
			b/=10;
		}
		System.out.println(d);
	}
}
