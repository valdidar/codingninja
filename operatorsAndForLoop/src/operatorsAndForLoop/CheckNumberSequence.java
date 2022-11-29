package operatorsAndForLoop;
import java.util.Scanner;
public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean a=true;
		int n1=s.nextInt(), n0=0,pattern=0;
		
		for(int i=1;i<n;i++) {
			n0=n1;
			n1=s.nextInt();
			if(pattern==0&&n1>n0) {
				pattern=1;
			}else if(pattern==1&&n1<n0) {
				a=false;
				break;
			}
		}
		System.out.println(a);
		
	}
}
