package fundamentals;

import java.util.Scanner;

public class alphabetDetector {
	public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>64&&a<91){
            System.out.print("1");
        }else  if(a>96&&a<123){
            System.out.print("0");
        }else{
            System.out.print("-1");
        }
    }
}
