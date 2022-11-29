package operatorsAndForLoop;
import java.util.Scanner;
import java.lang.Math;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		while(n/((i+1)*(i+1))>0)
			i++;
		System.out.println(i);
		
	}
}
