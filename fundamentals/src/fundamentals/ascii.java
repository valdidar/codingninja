package fundamentals;

public class Ascii {
	public static void main(String[] args) {
		int a='a';
		char b=(char) a;
		char c='a';
		System.out.println(a+" "+b+" "+c+" "+(char)a+" "+(int)b);
		a='a'+3;
		b=(char)('a'+3);
		c='a'+3;
		System.out.println(a+" "+b+" "+c+" "+(char)a+" "+(int)b);
		
	}
}
