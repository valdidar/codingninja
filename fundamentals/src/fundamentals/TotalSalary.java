package fundamentals;
import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		char grade=s.next().charAt(0);
		double allow;
		if(grade=='A'){
			allow=1700;
		}else if(grade=='B'){
			allow=1500;
		}else{
			allow=1300;
		}
		System.out.println((int)(1.59*(double)basic+allow+0.5));
	}
}
