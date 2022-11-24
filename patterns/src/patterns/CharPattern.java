package patterns;
import java.util.Scanner;
public class CharPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print((char)('A'-i+j+n-1));
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
