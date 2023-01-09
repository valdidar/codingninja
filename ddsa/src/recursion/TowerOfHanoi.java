package recursion;
import java.util.Scanner;
public class TowerOfHanoi {
	public static void towerOfHanoi(int n, char a, char b, char c) {
		if(n==0){
			return;
		}
		if(n==1) {
			System.out.println(a+" "+ c);
			return;
		}
		towerOfHanoi(n-1,a,c,b);
		System.out.println(a+" "+ c);
		towerOfHanoi(n-1,b,a,c);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}
}
