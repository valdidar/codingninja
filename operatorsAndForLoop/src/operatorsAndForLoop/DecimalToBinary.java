package operatorsAndForLoop;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] binary = new int[35];
        if(n==0){
			System.out.print(0);
		}else{
			int id = 0;
		while(n>0){
            binary[id++]=n%2;
            n=n>>1;
        }
        while(id > 0)
            System.out.print(binary[--id] + "");
		}
	}
}
