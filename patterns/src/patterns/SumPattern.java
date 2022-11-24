package patterns;
import java.util.Scanner;
public class SumPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=2*i-1){
				if(j%2==0){
					System.out.print("+");
				}else{
					System.out.print((j+1)/2);
				}
				j++;
			}
			System.out.println("="+i*(i+1)/2);
			i++;
		}
	}
}
