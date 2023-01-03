package classesandobjects;

public class Fraction {
	private int numenator;
	private int denominator;
	public final static int DEFAULTNUMINATOR=0;
	public final static int DEFAULTDENOMINATOR=1;
	Fraction(int numenator, int denominator) {
		this.numenator=numenator;
		if(denominator==0)
			this.denominator=DEFAULTDENOMINATOR;
		else
			this.denominator=denominator;
		Simplify();
	}
	Fraction(int numenator){
		this.numenator=numenator;
		this.denominator=DEFAULTDENOMINATOR;
	}
	Fraction(){
		this.numenator=DEFAULTNUMINATOR;
		this.denominator=DEFAULTDENOMINATOR;
	}
	public void setNumenator(int numenator) {
		this.numenator=numenator;
		Simplify();
	}
	public void setDenominator(int denominator) {
		if(denominator==0) {
			this.denominator=DEFAULTDENOMINATOR;
			return;
		}
		this.denominator=denominator;
		Simplify();
	}
	public int getNumenator() {
		return numenator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void printFraction() {
//		System.out.println(getNumenator()+"/"+getDenominator());
		System.out.println(numenator+"/"+denominator);
	}
	public void incrementFraction() {
		this.numenator+=this.denominator;
		Simplify();
	}
	private void Simplify(){
		int min=Math.min(numenator, denominator);
		int gcd=1;
		for(int i=1; i<=min;i++)
			if(numenator%i==0&&denominator%i==0)
				gcd=i;
		this.denominator/=gcd;
		this.numenator/=gcd;
		
	}
	public void addFraction(Fraction f1, Fraction f2) {
		this.numenator=f1.denominator*f2.numenator+f1.numenator*f2.denominator;
		this.denominator=f1.denominator*f2.denominator;
		Simplify();
	}
	
}
