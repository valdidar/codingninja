package FunctionAndScope;

import java.util.Scanner;

public class NcR {
	public static int factN(int n) {
		int factN=1;
		for(int i=1;i<=n;i++)
			factN*=i;
		return factN;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt() ;
		int r=s.nextInt() ;
		System.out.println(factN(n)/(factN(r)*(factN(n-r))));
		
	}

}
