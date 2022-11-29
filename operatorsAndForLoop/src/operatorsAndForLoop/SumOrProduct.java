package operatorsAndForLoop;
import java.util.Scanner;
public class SumOrProduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		if(c!=1&&c!=2) {
			System.out.println(-1);
		}else{
			int sum=0;
			if(c==2)
				sum+=1;
			for(int i=1;i<=n;i++) {
				if(c==1) {
					sum+=i;
				}else {
					sum*=i;
				}
			}
			System.out.println(sum);
		}
	}
}
