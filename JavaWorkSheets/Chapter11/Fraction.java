/*
 * Fraction.java
 * 
 */


public class Fraction
{
	private int num;
	private int den;
	
	public Fraction() { } // empty constructor
	
	public Fraction(int num, int den) // custom constructor
	{
		this.num = num;
		this.den = den;
	}
	// these constructors are overloaded
	public int getNum()
	{	return this.num;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	


}

