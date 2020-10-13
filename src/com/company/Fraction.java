
public class Fraction {
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	public Fraction()        // default constructor
	{
		numerator = 0;
		denominator = 1;
	}
	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	public Fraction subtract(Fraction other)
	{
		int n = this.numerator*other.denominator - this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();

		Fraction result = new Fraction(n,d);
		return result;
	}
	
	public Fraction multiply(Fraction other)
	{
		int n = this.numerator*other.numerator;
		int d = this.denominator*other.denominator;

		Fraction result = new Fraction(n,d);
		return result;
	}
	
	public String toString()
	{
		return (this.numerator + " / " + this.denominator);
	}

	public Fraction reciprocal()
	{
		int n = denominator;
		int d = numerator;

		Fraction result = new Fraction(n,d);
		return result;
	}
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("\n3/4 + 4/5 = " + f3);	// print the answer
			

		Fraction f4 = f1.subtract(f2);
		System.out.println("\n" + f1 + " - " + f2 + " = " + f4);

		Fraction f5 = f1.multiply(f2);
		System.out.println("\n" + f1 + " * " + f2 + " = " + f5);

		Fraction f6 = f1.reciprocal();
		System.out.println("\nThe reciprocal of " + f1 + " is " + f6);

		Fraction f7 = new Fraction(5,6);
		Fraction f8 = new Fraction(1,3);
		
		Fraction f9 = f7.add(f8);
		System.out.println("\n" + f7 + " + " + f8 + " = " + f9);
		

	}

}
