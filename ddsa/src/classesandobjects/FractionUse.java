package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1=new Fraction(4,0);
		f1.setNumenator(24);
		f1.setDenominator(18);
		f1.printFraction();
		Fraction f2;
		f2=new Fraction(4);
		f2.incrementFraction();
		f2.printFraction();
		Fraction f3=new Fraction(4,5);
		f3.printFraction();
		Fraction f4=new Fraction();
		f4.addFraction(f3,f2);
		f4.printFraction();
	}

}
