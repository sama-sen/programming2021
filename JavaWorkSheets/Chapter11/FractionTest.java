
public class FractionTest
{
	
	// main method for quick testing and demo purposes only
	public static void main(String[] args)
	{
		Fraction f = new Fraction();
		System.out.println( f );
		f.setNum(3);
		f.setDen(4);
		Fraction g = new Fraction(1, 2);
		//System.out.println( f.num + "/" + f.den );
		System.out.println( f );
		System.out.println( g );
	}
}

