package fundamentals;
	import java.util.Scanner;
public class moreScan {
	public static void main(String[] args) {
//		try (Scanner s = new Scanner(System.in)) {
//			String a=s.next();
//			char b=a.charAt(1);
//		 	System.out.println(a);
//			System.out.print(b);
//		} 
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = s.nextInt();
		System.out.print(str + " " + a);
		}
}
