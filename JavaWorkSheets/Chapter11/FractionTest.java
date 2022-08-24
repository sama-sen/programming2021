public class FractionTest
{
	
	// Test class for quick testing and demo purposes only
	public static void main(String[] args)
	{
		Fraction f = new Fraction();
		System.out.println( f );
		f.setNum(3);
		f.setDen(4);
		Fraction g = Fraction.enter();
		System.out.println( "Numerator input = " + f.getNum() +
				"\t Denominator input =" + f.getDen() );
		System.out.println( "f = " + f );
		System.out.println( "g = " + g );
		Fraction h = f.add(g);
		Fraction sum = new Fraction();
		sum.add(f, g);
		System.out.print(f + " + " + g + " = " + h + " = ");
		System.out.println(h.toDecimal());
		System.out.println("sum.equals(h) = " + f.equals(g));
		System.out.println("f.compareTo(g) = " + f.compareTo(g));
	}
}

