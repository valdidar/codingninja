package patterns;
import java.util.Scanner;
public class MirrorImagePattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=i+1;
			while(j<=n) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i) {
				System.out.print(k);
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
