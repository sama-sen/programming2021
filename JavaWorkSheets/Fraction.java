/*
 * Fraction.java
 * 
 */


public class Fraction
{
	private int num;
	private int den;
	
	public Fraction() { }
	
	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}
	
	public static void main(String[] args)
	{
		Fraction f = new Fraction();
		Fraction g = new Fraction(1, 2);
		System.out.println(f);
		System.out.println(g);
	}
}

