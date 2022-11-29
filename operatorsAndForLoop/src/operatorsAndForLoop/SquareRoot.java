package operatorsAndForLoop;
import java.util.Scanner;
import java.lang.Math;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int n1=((int) Math.log10(n)/2)+1;
//n1 is number of digits of answer and no of dash
//		int dvnt=0;
//		int root=0;
//		int pre=0;
//		int post=0;
//		int rem=0;
//		while(n1>0) {
//			dvnt=100*rem +n%((n1-1)*100);
//			post=post*10+(dvnt/((pre*10+x)-1))
//			n1--;
//		}
		int i=0;
		while(n/((i+1)*(i+1))>0)
			i++;
		System.out.println(i);
		
	}
}
