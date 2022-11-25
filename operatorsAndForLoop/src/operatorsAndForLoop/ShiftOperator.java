package operatorsAndForLoop;

import java.util.Scanner;

public class ShiftOperator {
	public static void printbinary(int n) {
		int[] binary = new int[35];
        int id = 0;
		while(n>0){
            binary[id++]=n%2;
            n=n>>1;
        }
        while(id > 0)
            System.out.print(binary[--id] + "");
        System.out.println();
	}
	public static void main(String[] args) {
// this type of bitwise operator is useful in multiplying and division by 2 with more efficiency
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printbinary(n);
		printbinary(n>>1);
		printbinary(n<<1);
	}
}
