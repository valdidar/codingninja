package operatorsAndForLoop;

public class PrecedenceAndAssociativity {
	public static void main(String[] args) {
//		    int a=10,b=20;
//		    System.out.println(a+++--b);//line 1
//		    System.out.println(a++---b);//line 2
//		    System.out.println(a--+++b);//line 3
//		    System.out.println(a---++b);//line 4
//		    System.out.println(a+++++b);//line 5
//		    System.out.println(a++-++b);//line 6
//		    System.out.println(a+++--b);//line 7
//		    System.out.println(a++---b);//line 8
		    int a=10;
		    a+=++a;
		    System.out.print(a);
	}
}
