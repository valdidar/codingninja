package patterns;
import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		while(i<n) {
			int j=0;
			while(j<n) {
				System.out.print(n);
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}
}
