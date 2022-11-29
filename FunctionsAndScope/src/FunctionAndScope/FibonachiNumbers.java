package FunctionAndScope;

public class FibonachiNumbers {
	public static boolean checkMember(int n) {
		int j=0;
		for(int j1=1,j2=0;j<=n;j2=j1,j1=j){
			j=j1+j2;
			if(j==n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n=5;
		boolean b=checkMember(n);
		System.out.println(b);
	}

	

}
