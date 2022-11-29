package FunctionAndScope;

import java.util.Scanner;

public class CelciusAndFarenheit {
	public static void printFahrenheitTable(int start, int end, int step) {

		for(int i=start;i<end;i+=step)
    {
        System.out.println(start+"\t"+(5*(start-32)/9));
        start=start+step;
    }
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		printFahrenheitTable(S,E,W);
	}
}
