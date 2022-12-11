package String;

public class Substring {
	public static void main(String[] args) {
		String a ="abcd";
		String b="abcda";
		System.out.println(a.compareTo(b));
		a="hello";
		for(int i=0;i<5;i++)
			System.out.println(a.substring(i,i+1));
		System.out.println(a.length());
		a="coding";
		for(int i=0;i<3;i++)
		{
		    System.out.print(a.substring(i,i+3));
		}
		
	}
}
