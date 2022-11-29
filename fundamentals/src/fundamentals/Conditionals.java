package fundamentals;

import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x = 15;
	    if(x <= 15){
	        System.out.print("Inside if  ");
	    }else if(x == 15){
	        System.out.print("Inside else if  ");
	    }
	    System.out.println(x);
	    int var1 = 5; 
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else 
            System.out.print(var2 + 1);
        int a=50;
        int b=Integer.MIN_VALUE;
        if(a/0==b)
        {

            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }
	}
		
}
