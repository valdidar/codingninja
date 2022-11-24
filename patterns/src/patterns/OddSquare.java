package patterns;
import java.util.Scanner;
public class OddSquare{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		while(i>=1) {
			int j=1;
			while(j<=i) {
				System.out.print(2*(j-i+n)-1);
				j++;
			}
			j=i+1;
			while(j<=n) {
				System.out.print(2*(j-i)-1);
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
