package patterns;
import java.util.Scanner;
public class TriangularStarPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=i;
			while(j>=1) {
				System.out.print(j);
				j--;
			}
			i++;
			System.out.println();
		}
	}
}
