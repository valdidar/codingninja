package fundamentals;
import java.util.Scanner;
public class CelciusAndFareneheit {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		while(S!=W+E) {
			System.out.println(S+" "+((S-32)*5/9));
			S+=W;
		}
	}
	
}
